package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] inarr = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 1; i <= inarr.length; i++) {
            inarr[i - 1] = i * i;
        }

        return inarr;
    }
}
