package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[0] != data[i]) {
                return false;
            }
        }
        return true;
    }
}