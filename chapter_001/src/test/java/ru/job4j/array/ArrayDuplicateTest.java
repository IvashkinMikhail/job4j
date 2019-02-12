package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expect = arr.remove(array);
        String[] result = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Мир"};
        String[] expect = arr.remove(array);
        String[] result = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] array = {"Привет"};
        String[] expect = arr.remove(array);
        String[] result = {"Привет"};
        assertThat(result, is(expect));
    }
}

