package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int p = 1;
        if (n == 0) {
            return p;
        }
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }
}
