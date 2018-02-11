package ru.alina;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MaxElementFinder {
    /**
     * Метод нахождения максимального элемента
     *
     * @param array массив
     * @return максимальный элемент массива
     */
    public String get(String[] array) {
        String maxElement = "";
        for (String current : array) {
            if (maxElement.length() < current.length()) {
                maxElement = current;
            }
        }
        return maxElement;
    }

}