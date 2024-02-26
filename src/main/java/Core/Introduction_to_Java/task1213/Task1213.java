package src.main.java.Core.Introduction_to_Java.task1213;

import java.lang.Math;

/**
 * Цель: Вычисление радиуса окрудности по площади с использованием класса Math.
 *
 * Что нужно знать:
 *
 * 1. Класс Math (методы и константы)
 *
 * 2. Базовая арифметика
 *
 * 3. System.out.printf
 *
 * Задание:
 *
 * Реализовать метод calcCircleRaduis(double area), который вычисляет радиус окружности по заданной площади и выводит его на экран.
 * Точность - 3 знака после запятой. Для указания количества знаков после запятой используйте метод для форматированного вывода System.out.printf
 *
 * Пример ввода: 123
 *
 * Пример вывода: 6.257
 *
 * Пример ввода: 10
 *
 * Пример вывода: 1.784
 */
public class Task1213 {
    public static void main(String[] args) {
        double area = 123;
        System.out.println(calcCircleRaduis(area));
    }
    public static double calcCircleRaduis(double area) {
        double pi = Math.PI;
        return Math.round((Math.sqrt(area/pi)) * 1000.0) / 1000.0;
    }
}
