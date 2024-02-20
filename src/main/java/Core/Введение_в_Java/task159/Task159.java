package src.main.java.Core.Введение_в_Java.task159;

import java.util.Arrays;

/**
 * Цель: научиться выводить массив с его значениями в консоль.
 * Что нужно знать:
 * 1. методы класса System
 * 2. Arrays
 * Задание:
 * Реализуйте метод, который будет принимать массив чисел и выводить его значения в консоль c помощью методов класса Arrays
 * Пример ввода: {1,2,3,4,5,5,6,7,7}
 * Пример вывода: [1, 2, 3, 4, 5, 5, 6, 7, 7]
 * Пример ввода: {}
 * Пример вывода: []
 */
//STATUS+
public class Task159 {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,5,6,7,7};
        printArray(num);
    }
    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

}
