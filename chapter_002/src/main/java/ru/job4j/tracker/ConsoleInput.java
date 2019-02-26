package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput {
    public String ask(String ask) {
        System.out.println(ask);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
