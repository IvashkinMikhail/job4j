package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean ret = true;
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[0] != data[i]) {
                ret = false;
            }
        }
        return ret;
    }
}