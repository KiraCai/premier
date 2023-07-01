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
    //FIXME кодстайл
    //FIXME английский
public class Task154 {
    //public static int st = 0;
    //public static int en = 1;
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6, 9, 11, 24};
        int minNum = 4;
        int maxNum = 10;

        int[] anser = getSubArrayBetween(num, minNum, maxNum);
        Task153.printArray2(anser);
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int startNew = 0;
        int endNew = 0;
        while (start>numbers[startNew]){
            startNew++;
        }
        while (end>numbers[endNew]){
            endNew++;
        }
        int lenghtNew = endNew - startNew;
        int[] newRoy = new int[(lenghtNew)];
        for (int i = 0; i<newRoy.length; i++){
            //FIXME можно переделать цикл, чтобы избежать операции сложения
            newRoy[i] = numbers[i+startNew];
        }
        return newRoy;
    }
}
