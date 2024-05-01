package src.main.java.Core.Introduction_to_Java.task153;

import java.util.StringJoiner;

/**
 * Цель: научиться выводить массив с его значениями в консоль.
 * Что нужно знать:
 * 1. методы класса System
 * 2. циклы
 * Задание:
 * В java для вывода информации в консоль используются методы System.out.print(), System.out.println().
 * Однако если мы захотим вывести на экране массив с его значениями, просто поместив его в этот метод, например так:
 * int[] numbers = {1, 2 ,3 ,4 ,5};
 * System.out.println(numbers);
 * то в консоли мы увидем что-то типа такого:
 * [I@7ba4f24f
 * Все потому что по умолчанию в массивах используется метод toString, определенный в классе Object.
 * Поэтому для вывода значения массива в консоль нам понадобится написать свой метод.
 * Реализуйте метод, который будет принимать массив чисел, и выводить его значения в консоль.
 * Пример ввода: {1,2,3,4,5,5,6,7,7}
 * Пример вывода: [1, 2, 3, 4, 5, 5, 6, 7, 7]
 * Пример ввода: {}
 * Пример вывода: []
 * Требования:
 * метод должен быть public static
 * сигнатура метода printArray(int[] numbers)
 * Элементы массива должны быть заключены в квадратные скобки []
 * Элементы массива отделены друг от друга запятой и пробелом.
 * Не использовать класс Arrays
 */
//STATUS+
public class Task153 {
    public static void main(String[] args){
        int[] numbers = {};
        printArray(numbers);
        printArray2(numbers);
    }
    public static void printArray(int[] num) {
        System.out.print('[');
        for (int i = 0; i < num.length; i++) {
            if (i < num.length - 1) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }
        }
        System.out.println(']');
    }
    public static void printArray2(int[] num) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < num.length; i++) {
            sj.add(String.valueOf(num[i]));
        }
        System.out.print(sj);
    }
}
