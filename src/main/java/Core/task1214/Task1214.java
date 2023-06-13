package src.main.java.Core.task1214;

import java.math.BigDecimal;
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
        //FIXME объявление лишней переменной можно сразу положить Long.MAX_VALUE
        long lo = Long.MAX_VALUE;
        BigInteger longMax = BigInteger.valueOf(lo);
        return longMax.multiply(longMax);
    }
}