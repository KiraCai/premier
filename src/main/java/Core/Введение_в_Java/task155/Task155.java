package src.main.java.Core.Введение_в_Java.task155;

import src.main.java.Core.Введение_в_Java.task153.Task153;

/**
 * Цель: Вернуть середину массив
 * Что нужно знать:
 * 1. Массивы
 * 2. Условные операторы
 * 3. Циклы
 * Задание:
 * Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины,
 * то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
 * Пример ввода: {1, 5, 2, 17}
 * Пример вывода: [5, 2]
 * Пример ввода: {14, 16, 3}
 * Пример вывода: [16]
 * Пример ввода: {}
 * Пример вывода: []
 * Требования:
 * Метод должен быть public static
 * Сигнатура метода getArrayMiddle(int[] numbers)
 * Не использовать Arrays, System.arrayCopy
 */
    //STATUS-
public class Task155 {
    public static void main(String[] args) {
        int[] numbers = {};
        int[] xert = getArrayMiddle(numbers);
        Task153.printArray2(xert);
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int[] num0 = {};
        if (numbers.length == 0) {
            return num0 = new int[0];
        }
        if (numbers.length % 2 == 0) {
            int[] num2 = new int[2];
            num2[0] = numbers[(numbers.length - 2) / 2];
            num2[1] = numbers[numbers.length / 2];
            return num2;
        }
        if (numbers.length % 2 != 0) {
            num0[0] = numbers[numbers.length / 2];
            return num0;
        }
        return num0;
    }
}