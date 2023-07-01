package src.main.java.Core.task157;

import src.main.java.Core.task153.Task153;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Цель: Слить два произвольных массива в один отсортированный
 * Что нужно знать:
 * 1. Массивы
 * 2. Циклы
 * 3. Условные операторы
 * Задание:
 * Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает соединяет и сортирует два произвольных массива чисел
 * Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
 * Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 * Пример ввода: {} {1, 4, 3}
 * Пример вывода: [1, 3, 4]
 * Требования:
 * метод должен быть public static
 * сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
 * Не использовать Arrays.
 */
//STATUS-
public class Task157 {
    public static void main(String[] args) {
        int[] num = {4, 7, 3, 5};
        int[] mi = {8, 4, 2, 4};
        int[] newArray = mergeAndSortNew(num, mi);
        Task153.printArray2(newArray);
    }

    public static int[] mergeAndSortNew(int[] fir, int[] sec) {
        int aL = fir.length;
        int bL = sec.length;
        int cL = aL + bL;
        int[] bir = new int[aL];
        //int[] bir = new int[cL];
        int[] nevv = new int[cL];
        int minInt = fir[0];
        int I = 0;
        int maxInt = fir[0];
        int PI = 0;
        // поиск максимального
        for (int k = 0; k < fir.length; k++) {
            if (fir[k] > maxInt) {
                maxInt = fir[k];
            }
        }
        System.out.println(maxInt);
        for (int i = 0; i < bir.length; i++) {
            //fir[I] = maxInt;
            for (int j = 0; j < fir.length; j++) {
                if (fir[j] < minInt) {
                    minInt = fir[j];
                    I = j;
                }
            }

            System.out.println(bir[i]);
            fir[I] = maxInt;
            bir[i] = minInt;
        }
        return bir;
    }
}
