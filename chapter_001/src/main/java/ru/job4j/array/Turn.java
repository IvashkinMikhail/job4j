package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int p;
        for (int i = array.length - 1; i >= (array.length) / 2; i--) {
            p = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = p;
        }
        return array;
    }
}