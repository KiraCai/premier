package src.main.java.Core.Introduction_to_Java.task1214;

import  java.lang.Long;
import java.math.BigInteger;

/**
 * Цель: Использовать арифметические операции с BigInteger
 *
 * Что нужно знать:
 *
 * 1. класс BigInteger
 *
 * 2. класс Long
 *
 * Задание:
 *
 * Реализовать метод, который выведет на экран квадрат максимального значения, которое может содержаться в переменной long.
 * Чтобы это значение уместилось, необходимо использовать класс BigInteger
 */
public class Task1214 {
    public static void main(String[] args){
        System.out.println(maxLongSqr());
    }
    public static BigInteger maxLongSqr() {
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);
        return longMax.multiply(longMax);
    }
}