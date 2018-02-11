package ru.alina;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CalculatorInterface {
    private Calculator calculator;

    public CalculatorInterface() {
        calculator = new Calculator();
    }

    public void perform() {

        try (Scanner scanner = new Scanner(System.in)) {
            // =========================================================
            CalculatorOperation currentOperation;
            while (true) {
                System.out.println("Введите тип операции (PLUS, MINUS, MULTIPLY, DIVIDE или используйте символы операций) или q для выхода:");
                String operationString = scanner.nextLine();
                currentOperation = CalculatorOperation.parse(operationString);

                if (currentOperation == CalculatorOperation.UNKNOWN) {
                    System.out.println("Операция введена некорректно!");
                } else if (currentOperation == CalculatorOperation.EXIT) {
                    break;
                } else {
                    boolean inputCorrect = false;
                    double a = 0;
                    double b = 0;
                    inputCorrect = false;
                    while (!inputCorrect) {
                        System.out.println("Введите первый аргумент:");
                        String inputA = scanner.nextLine();
                        try {
                            a = Double.parseDouble(inputA);
                            inputCorrect = true;
                        } catch (NumberFormatException nex) {
                            System.out.println("Можно вводить только числа!");
                        }
                    }
                    inputCorrect = false;
                    while (!inputCorrect) {
                        System.out.println("Введите второй аргумент:");
                        String inputB = scanner.nextLine();
                        try {
                            b = Double.parseDouble(inputB);
                        } catch (NumberFormatException nex) {
                            System.out.println("Можно вводить только числа!");
                            continue;
                        }
                        inputCorrect = true;
                        // =========================================================
                    }

                    switch (currentOperation) {
                        case PLUS:
                            System.out.printf("Сумма равна: %.4f\n", calculator.sum(a, b));
                            break;
                        case MINUS:
                            System.out.printf("Разность равна: %.4f\n", calculator.residual(a, b));
                            break;
                        case MULTIPLY:
                            System.out.printf("Произведение равно: %.4f\n", calculator.product(a, b));
                            break;
                        case DIVIDE:
                            System.out.printf("Частное равно: %.4f\n", calculator.quotient(a, b));
                            break;

                    }
                }
            }
        }
    }
}