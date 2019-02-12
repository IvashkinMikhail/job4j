package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int al = array.length;
        for (int k = 0; k < al; k++) {
            for (int i = k + 1; i < al; i++) {
                if (array[k].equals(array[i])) {
                    array[i] = array[al - 1];
                    al--;
                    i--;
                }
            }
        }
        return Arrays.copyOf(array, al);
    }
}
