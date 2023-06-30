package src.main.java.Core.task156;

import src.main.java.Core.task153.Task153;

import java.util.StringJoiner;

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
        int[] trew = inverseArray(numbers);
        Task153.printArray2(trew);
    }
    public static int[] inverseArray(int[] numb) {
        int[] vers = new int[numb.length];

        for (int i = 0; i < numb.length; i++) {
            if (i < numb.length - 1) {
                vers[i] += numb[vers.length - 1 - i];
            } else {
                vers[i] = numb[0];
            }
        }
        return vers;
    }
}
