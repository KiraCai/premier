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
        //FIXME через while
        int startNew = 0;
        int endNew = 0;
        System.out.println(numbers.length);
        //int j = 0;
        while (start<numbers[startNew]){
            startNew++;
            System.out.println(startNew);
        }
        //int k = 0;
        while (end<numbers[endNew]){
            endNew++;
            System.out.println("блядь");
            System.out.println(endNew);
        }

        int lenghtNew = endNew - startNew;
        System.out.println(lenghtNew);
        int[] newRoy = new int[(lenghtNew)];
        //FIXME можно проще заполнить, помни что исходник отсортирован
        for (int i = 0; i < numbers.length; i++) {
            int counter = 0;
            for (int r = 0; r < newRoy.length; r++) {
                if (numbers[i] >= start & numbers[i] <= end & newRoy[r] == 0 & counter == 0) {
                    newRoy[r] = numbers[i];
                    counter = counter + 1;
                }
            }
        }
        return newRoy;
    }
}
