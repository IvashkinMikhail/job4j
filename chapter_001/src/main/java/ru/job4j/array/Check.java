package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[0] != data[i]) {
                return false;
            } else {
                result = true;
            }
        }
        return result;
    }
}