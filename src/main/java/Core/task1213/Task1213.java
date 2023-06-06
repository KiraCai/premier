package src.main.java.Core.task1213;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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
 * Реализовать метод calcCircleRaduis(double area), который вычисляет радиус окружности по заданной площади и выводит его на экран. Точность - 3 знака после запятой. Для указания количества знаков после запятой используйте метод для форматированного вывода System.out.printf
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
        BigDecimal area = BigDecimal.valueOf(10.9898786);
        System.out.println(calcCircleRaduis(area));
    }
    public static String calcCircleRaduis(BigDecimal area) {
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal divideAreaAndPi = area.divide(pi, 2, RoundingMode.HALF_UP); // из интернета
        double divideDouble = divideAreaAndPi.doubleValue();
        double r = Math.sqrt(divideDouble);
        String formattedR = new DecimalFormat("#0.000").format(r); // тоже
        return formattedR;
    }
}
