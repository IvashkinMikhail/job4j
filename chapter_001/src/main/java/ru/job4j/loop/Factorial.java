package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int varforret = 1;
        if (n == 0) {
            return varforret;
        }
        for (int i = 1; i <= n; i++) {
            varforret *= i;
        }
        return varforret;
    }
}
