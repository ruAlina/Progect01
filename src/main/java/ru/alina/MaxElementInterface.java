package ru.alina;

import java.util.Scanner;

public class MaxElementInterface {
    private MaxElementFinder finder;

    public MaxElementInterface() {
        finder = new MaxElementFinder();
    }

    public void perform() {
        int a = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            boolean inputCorrect = false;
            while (!inputCorrect) {
                System.out.println("Введите длину массива:");
                String inputA = scanner.nextLine();
                try {
                    a = Integer.parseInt(inputA);
                    inputCorrect = true;
                } catch (NumberFormatException nex) {
                    System.out.println("Можно вводить только целые числа!");
                }
            }
            inputCorrect = false;
            String[] array = new String[a];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < a; i++) {
                array[i] = scanner.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
            }
            System.out.printf("Максимальный элемент:" + finder.get(array));
        }
    }
}