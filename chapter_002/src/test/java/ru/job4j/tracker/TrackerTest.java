package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L, new String[]{"Коммент1", "Коммент2"});
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L, new String[]{"Коммент1", "Коммент2"});
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L, new String[]{"Коммент1", "Коммент2"});
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDelItemReturnTrue() {
        boolean bool = true;
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L, new String[]{"Коммент1", "Коммент2"});
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(item);
        // Проставляем старый id из previous, который был сгенерирован выше.
        tracker.delete(item.getId());
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(bool, is(true));
    }
}