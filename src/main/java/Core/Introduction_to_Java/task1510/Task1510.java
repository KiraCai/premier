package src.main.java.Core.Introduction_to_Java.task1510;

import src.main.java.Core.Introduction_to_Java.task153.Task153;

import java.util.Arrays;

/**
 * Цель: Вернуть середину массива
 * Что нужно знать:
 * 1. Массивы
 * 2. Класс Arrays.
 * Задание:
 * Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины,
 * то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
 * Пример ввода: {1, 5, 2, 17}
 * Пример вывода: [5, 2]
 * Пример ввода: {14, 16, 3}
 * Пример вывода: [16]
 * Пример ввода: {}
 * Пример вывода: []
 */
//STATUS-
public class Task1510 {
    public static void main(String[] args) {
        int[] num = {14, 16, 12};
        int[] array = getArrayMiddle(num);
        Task153.printArray2(array);
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int[] arrNew = {};
        if (numbers.length % 2 == 0) {
            arrNew = Arrays.copyOfRange(numbers, (numbers.length / 2) - 1, (numbers.length / 2) + 1);
        } else {
            arrNew = Arrays.copyOfRange(numbers, (numbers.length / 2), (numbers.length / 2) + 1);
        }
        return arrNew;

    }
}
