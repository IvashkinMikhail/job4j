package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author Misha Ivashkin
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод реализаущий редактирования заявки в хранилище
     *
     * @param item для вставки измененного объекта
     * @param id   для поиска объекта Item по айди в массиве
     */
    public boolean replace(String id, Item item) {
        boolean retvar = false;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                item.setId(this.items[i].getId());
                this.items[i] = item;
                retvar = true;
                break;
            }
        }
        return retvar;
    }

    /**
     * Метод реализаущий удаление заявки в хранилище
     *
     * @param id для поиска по айди
     */
    public boolean delete(String id) {
        boolean retvar = false;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                retvar = true;
                break;
            }
        }
        return retvar;
    }

    /**
     * Метод возвращает копию массива без null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items и
     * элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
     *
     * @param key для проверки имени в объекте item
     */
    public Item[] findByName(String key) {
        int ccount = 0;
        Item[] arrayNeedName = new Item[position];
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                arrayNeedName[ccount] = this.items[i];
                ccount++;
            }
        }
        return arrayNeedName;
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     *
     * @param id для сравнения с айди в массиве
     */
    public Item findById(String id) {
        Item retVar = null;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                retVar = this.items[i];
            }
        }
        return retVar;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return LocalDateTime.now() + String.valueOf(position);
    }

}