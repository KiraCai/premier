package src.main.java.prepay.task392;

import java.util.Stack;

/**
 * Создайте метод static void printArray(int[] arr), который принимает массив целых чисел и выводит их в консоль,
 * каждое с новой строки.
 *
 * Пример ввода: [2,4,6]
 * Пример вывода:
 *                                 2
 *                                 4
 *                                 6
 *
 * Требования:
 * 1. Метод должен принимать массив целых чисел
 * 2. Метод не должен ничего возвращать
 * 3. Метод должен выводить каждое число с новой строки
 */
public class Task392 {
    public static void main(String[] args){
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = 8;
        printArray(array);
    }

    static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
