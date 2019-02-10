package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        int p;
        for (int j = 0; j <= array.length - 2; j++) {
            for (int i = 0; i <= array.length - 2 - j; i++) {
                if (array[i] > array[i + 1]) {
                    p = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = p;
                }
            }
        }
        return array;
    }
}
