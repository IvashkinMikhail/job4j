package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Ivashkin MIkhail (ivashkinmd@inbox.ru).
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    /**
     * переменная в которую методы записывают выполненные результаты
     */
    private double result;

    /**
     * метод для сложения двух чисел с плавающей точкой
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * метод для вычитания двух чисел с плавающей точкой
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * метод для деления двух чисел с плавающей точкой
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * метод для умножения двух чисел с плавающей точкой
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }

    /**
     * метод возвращающий результат из переменной result
     */
    public double getResult() {
        return this.result;
    }
}