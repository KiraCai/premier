package src.main.java.Core.Introduction_to_Java.task133;

/**
 *Цель: Узнать про неявные приведения
 *
 * Что нужно знать:
 *
 * 1. Арифметические операции
 *
 * 2. Примитивные типы
 *
 * 3. неявные приведения
 *
 * Задание:
 *
 * Реализовать метод, который будет принимать два числа, выражающие возраст людей, и возвращать разницу в возрасте.
 *
 * Пример ввода: 2, 5
 *
 * Пример вывода: 3
 *
 * Пример ввода: 4, 1
 *
 * Пример вывода: 3
 *
 * Требования:
 *
 * метод должен быть public static
 * сигнатура метода getAgeDiff(byte age1, byte age2)
 * метод возвращает byte
 */
public class Task133 {
    public static void main(String[] args){
        int ag1 = 3;
        int ag2 = 7;
        byte age01 = (byte)ag1;
        byte age02 = (byte)ag2;
        System.out.println(getAgeDiff(age01, age02));
    }
    public static byte getAgeDiff(byte age1, byte age2){
        return (byte) Math.abs(age1 - age2);
    }
}
