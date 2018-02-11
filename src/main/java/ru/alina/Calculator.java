package ru.alina;

public class Calculator {

    /**
     * Метод вычисления суммы двух чисел
     *
     * @param a первый аргумент
     * @param b второй аргумент
     * @return сумма аргументов
     */
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * Метод вычисления разности двух чисел
     *
     * @param a первый аргумент
     * @param b второй аргумент
     * @return разность аргументов
     */
    public double residual(double a, double b) {
        return a - b;
    }

    /**
     * Метод вычисления произведения двух чисел
     *
     * @param a первый аргумент
     * @param b второй аргумент
     * @return произведение аргументов
     */
    public double product(double a, double b) {
        return a * b;
    }

    /**
     * Метод вычисления частного двух чисел
     *
     * @param a первый аргумент
     * @param b второй аргумент
     * @return частное аргументов
     */
    public double quotient(double a, double b) {
        return a / b;
    }
}
