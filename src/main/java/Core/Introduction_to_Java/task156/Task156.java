package src.main.java.Core.Introduction_to_Java.task156;

import src.main.java.Core.Introduction_to_Java.task153.Task153;

/**
 * Цель: Развернуть данный массив
 * Что нужно знать:
 * 1. Работа с массивами
 * 2. Циклы
 * Задание: Написать метод, который принимает массив, разворачивает его и возвращает.
 * Пример ввода: {1, 4, 6, 7}
 * Пример вывода: [7, 6, 4, 1]
 * Пример ввода: {}
 * Пример вывода: []
 */
//STATUS-
public class Task156 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 9, 11, 24};
        int[] inversNumbers = inverseArray(numbers);
        Task153.printArray2(inversNumbers);
    }

    public static int[] inverseArray(int[] numb) {
        int[] invers = new int[numb.length];
        for (int i = 0; i < numb.length; i++) {
            invers[i] = numb[invers.length - 1 - i];
        }
        return invers;
    }
}
