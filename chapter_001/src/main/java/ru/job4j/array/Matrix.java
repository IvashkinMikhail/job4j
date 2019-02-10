package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int k = 0; k <= size - 1; k++) {
            for (int i = 0; i <= size - 1; i++) {
                table[k][i] = (k + 1) * (i + 1);
            }
        }
        return table;
    }
}

