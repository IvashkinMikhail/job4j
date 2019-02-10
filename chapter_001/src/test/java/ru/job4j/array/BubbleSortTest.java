package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //{1, 5, 4, 2, 3, 1, 7, 8, 0, 5}
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 6, 0};
        int[] result = bubble.sort(array);
        int[] expect = {0, 1, 1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithThreeElementsThenSortedArray() {
        //{1, 5, 4, 2, 3, 1, 7, 8, 0, 5}
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[]{5, 4, 1};
        int[] result = bubble.sort(array);
        int[] expect = {1, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithTwoElementsThenSortedArray() {
        //{1, 5, 4, 2, 3, 1, 7, 8, 0, 5}
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[]{5, 4};
        int[] result = bubble.sort(array);
        int[] expect = {4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithOneElementsThenSortedArray() {
        //{1, 5, 4, 2, 3, 1, 7, 8, 0, 5}
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[]{5};
        int[] result = bubble.sort(array);
        int[] expect = {5};
        assertThat(result, is(expect));
    }
}

