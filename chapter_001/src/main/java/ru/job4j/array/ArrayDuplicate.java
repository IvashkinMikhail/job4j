package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int arrlength = array.length;
        for (int out = 0; out < arrlength; out++) {
            for (int in = out + 1; in < arrlength; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[arrlength - 1];
                    arrlength--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, arrlength);
    }
}
