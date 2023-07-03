package src.main.java.Core.task1511;

import src.main.java.Core.task153.Task153;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Цель: Слить два произвольных массива в один отсортированный
 * Что нужно знать:
 * 1. Массивы
 * 2. Циклы
 * 3. Условные операторы
 * Задание:
 * Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает,
 * соединяет и сортирует два произвольных массива чисел
 * Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
 * Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 * Пример ввода: {} {1, 4, 3}
 * Пример вывода: [1, 3, 4]
 */
//STATUS-
public class Task1511 {
    public static void main(String[] args){
        int[] a = {1, 3, 7, 5};
        int[] b = {8, 4, 2, 4};
        int[] newSortArray = mergeAndSort(a, b);
        Task153.printArray2(newSortArray);
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int firstLength = firstArray.length;
        int secondLength = secondArray.length;
        int newArrayLenght = firstLength + secondLength;
        int[] newArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        Arrays.sort(newArray);
        return newArray;
    }
}