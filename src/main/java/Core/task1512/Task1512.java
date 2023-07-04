package src.main.java.Core.task1512;

import src.main.java.Core.task153.Task153;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую.
 * Конец вывода должен перевести курсор на новую строку.
 * Пример ввода: [3,5,20,8,7,3,100]
 * Пример вывода: 3,5,7,3
 * Требования:
 * Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */
//STATUS-
public class Task1512 {
    public static void main(String[] args) {
        int[] num = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(num);
    }

    public static void printOddNumbers(int[] arr) {
        int del = 0;
        StringJoiner sj = new StringJoiner(",", "", "");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != del) {
                sj.add(String.valueOf(arr[i]));
            }
        }
        System.out.print(sj);
    }
}