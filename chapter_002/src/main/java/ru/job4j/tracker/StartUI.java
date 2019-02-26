package ru.job4j.tracker;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    private static final String FNDITEMBYNAME = "5";
    private static final String FNDITEMBYID = "4";
    private static final String DELITEM = "3";
    private static final String EDITITEM = "2";
    private static final String SHOWALLITEMS = "1";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final ConsoleInput input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALLITEMS.equals(answer)) {
                for (Item i : tracker.findAll()) {
                    System.out.println(i.getId() + " " + i.getName());
                }
            } else if (EDITITEM.equals(answer)) {
                this.replaceItem();
            } else if (DELITEM.equals(answer)) {
                this.delItem();
            } else if (FNDITEMBYID.equals(answer)) {
                this.findItemById();
            } else if (FNDITEMBYNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            } else {
                System.out.println("Введите цифру меню");
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void replaceItem() {
        System.out.println("------------ Изменение заявки --------------");
        String id = this.input.ask("Введите id заявки которую необходимо изменить :");
        if (tracker.findById(id) != null) {
            String name = this.input.ask("Введите имя заявки :");
            String desc = this.input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, 123L, new String[]{"Коммент1", "Коммент2"});
            this.tracker.replace(id, item);
            System.out.println("------------ Заявка с getId : " + item.getId() + " изменена -----------");
        } else {
            System.out.println("------------ Заявка с getId : " + id + " не найдена -----------");
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, 123L, new String[]{"Коммент1", "Коммент2"});
        this.tracker.add(item);
        System.out.println("------------ Новая заявка добавлена с getId : " + item.getId() + " -----------");
    }

    /**
     * Метод реализует удаление заявки из хранилища.
     */
    private void delItem() {
        System.out.println("------------ Удаление заявки  --------------");
        String id = this.input.ask("Введите id заявки :");
        if (tracker.delete(id)) {
            System.out.println("------------ Заявка удалена с getId : " + id + " -----------");
        } else {
            System.out.println("------------ Такого id " + id + " нет -----------");
        }
    }

    /**
     * Метод реализует поиск заявки в хранилище по имени
     */
    private void findItemByName() {
        System.out.println("------------ Поиск заявки  --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item[] itemCheck = tracker.findByName(name);
        if (itemCheck[0] != null) {
            System.out.println("------------ Найдено с именем: " + name + " " + itemCheck.length + " штук(и) -----------");
            for (Item i : itemCheck
            ) {
                System.out.println(i.getId());
            }
        } else {
            System.out.println("------------ Такого имени " + name + " нет -----------");
        }
    }

    /**
     * Метод реализует поиск заявки в хранилище по айди
     */
    private void findItemById() {
        System.out.println("------------ Поиск заявки  --------------");
        String id = this.input.ask("Введите id заявки :");
        Item itemCheck = tracker.findById(id);
        if (itemCheck != null) {
            System.out.println("------------ Заявка найдена : " + itemCheck.getName() + " -----------");
        } else {
            System.out.println("------------ Такого id " + id + " нет -----------");
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запускт программы.
     *
     * @param args массив строк
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}