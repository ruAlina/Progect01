package ru.alina;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = 0;
            boolean inputCorrect = false;
            while (!inputCorrect) {
                System.out.println("Введите номер задания (1 - калькулятор, 2 - поиск максимального слова в массиве):");
                String inputA = scanner.nextLine();
                try {
                    a = Integer.parseInt(inputA);
                    if (a == 1 || a == 2) {
                        inputCorrect = true;
                    }
                } catch (NumberFormatException nex) {
                    System.out.println("Можно выбрать только задание 1 или 2");
                }
            }
            inputCorrect = false;
            switch (a) {
                case 1:
                    CalculatorInterface task1 = new CalculatorInterface();
                    task1.perform();
                    break;
                case 2:
                    MaxElementInterface task2 = new MaxElementInterface();
                    task2.perform();
                    break;
            }
        }
    }
}