package src.main.java.Core.task1511;

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
public class Task1511 {
    public static void main(String[] args){
        int[] a = {1, 3, 7, 5};
        int[] b = {8, 4, 2, 4};
        mergeAndSort(a, b);
    }
    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        int [] ppo = IntStream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray)).toArray();
        Arrays.sort(ppo);
        System.out.println(Arrays.toString(ppo));
    }
}