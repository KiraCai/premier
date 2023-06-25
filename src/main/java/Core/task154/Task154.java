package src.main.java.Core.task154;

import src.main.java.Core.task153.Task153;

import java.util.StringJoiner;

/**
 * Дан массив возрастающих чисел. Даны два числа. Задача - написать метод, который из данного массива достанет ту часть, которая лежит между данными числами (включительно) и вернет ее в качестве массива.
 * Что нужно знать:
 * 1. Работа с массивам
 * 2. Циклы
 * 3. Условные операторы
 * Пример ввода: {1,3,5,6,9,11,24}, 4, 10
 * Пример вывода: [5, 6, 9]
 * Требования:
 * метод должен быть public static
 * сигнатура метода getSubArrayBetween(int[] numbers, int start, int end)
 * метод должен возвращать int[] (подмассив)
 * реализовать задачу без ипользования класса Arrays
 */
//STATUS-
public class Task154 {
    public static void main(String[] args){
        int[] num = {1, 3, 5, 6, 9, 11, 24};
        int n = 4;
        int r = 10;
        getSubArrayBetween(num, n, r);
    }
    public static void getSubArrayBetween(int[] numbers, int start, int end) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start & numbers[i] <= end) {
                sj.add(String.valueOf(numbers[i]));
                }
            }
        System.out.print(sj);
    }
}
