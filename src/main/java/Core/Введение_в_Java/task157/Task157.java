package src.main.java.Core.Введение_в_Java.task157;

import src.main.java.Core.Введение_в_Java.task153.Task153;

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
        int[] num = {4, 7, 3, 5, 1, 8, 2};
        int[] mi = {8, 4, 2, 4};
        int[] newArray = mergeAndSortNew(num, mi);
        Task153.printArray2(newArray);
        int[] newArray2 = mergeAndSortNew1(num, mi);
        Task153.printArray2(newArray2);
    }

    public static int[] mergeAndSortNew1(int[] arr1, int[] arr2) {
        int variable = 0;
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    variable = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = variable;
                }
            }
        }
        return arr1;
    }

    public static int[] mergeAndSortNew(int[] first, int[] second) {
        int firstLenght = first.length;
        int secondLenght = second.length;
        int commonLenght = firstLenght + secondLenght;
        int[] sortFirst = new int[firstLenght];
        int[] common = new int[commonLenght];
        int[] sortCommon = new int[commonLenght];
        int minInt = first[0];
        int IChange = 0;
        int maxInt = first[0];
        //слияние двух в один
        int r = 0;
        int s = 0;
        for (int m = 0; m < commonLenght; m++) {
            while (r < firstLenght) {
                common[r] = first[r];
                r++;
            }
            while (s < secondLenght) {
                common[firstLenght + s] = second[s];
                s++;
            }
        }
        // поиск максимального
        for (int k = 0; k < common.length; k++) {
            if (common[k] > maxInt) {
                maxInt = common[k];
            }
        }
        int i = 0;
        for (int k = 0; k < sortCommon.length; k++) {
            int counter = 0;
            while (i < common.length & counter < 1) {
                for (int j = 0; j < common.length; j++) {
                    if (common[j] < minInt) {
                        minInt = common[j];
                        IChange = j;
                    }
                }
                sortCommon[k] = minInt;
                minInt = maxInt;
                common[IChange] = maxInt;
                i++;
                counter++;
            }
        }
        return sortCommon;
    }
}
