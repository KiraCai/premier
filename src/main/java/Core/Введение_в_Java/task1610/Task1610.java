package src.main.java.Core.Введение_в_Java.task1610;
import java.lang.*;

/**
 * Цель: Преобразование сроки в число
 * Что нужно знать:
 * 1. Класс Sctring
 * 2. Класс Long
 * 3. Класс Math
 * Задание:
 * Реализовать метод, который будет принимать целочисленное (long) число в строковом виде (например "14213123"),
 * преобразовывать его в тип long, вычислять из него квадратный корень, и округлять получившееся значение до ближайшего long.
 * Дл яокругления воспользуйтесь классом Math.
 * Пример ввода: "64"
 * Пример вывода: 8
 * Пример ввода: "5"
 * Пример вывода: 2
 * Требования:
 * метод должен быть public static
 * сигнатура метода parseAndSqrt(String number)
 * метод возвращает long
 */
public class Task1610 {
    public static void main(String[] args){
        String num = "64";
        System.out.println(parseAndSqrt(num));

    }
    public static long parseAndSqrt(String number) {
        long num1 = Long.parseLong(number);
        double num2 = Math.round(Math.sqrt((double)num1));
        return (long) num2;
    }
}
