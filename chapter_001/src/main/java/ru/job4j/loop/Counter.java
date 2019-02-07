package ru.job4j.loop;

public class Counter {


    public int add(int start, int finish) {
        int p = 0;
        for (int i = start; i <= finish; i++)
            p += i % 2 == 0 ? i : 0;
        return p;
    }

}
