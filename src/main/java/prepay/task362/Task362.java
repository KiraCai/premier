package src.main.java.prepay.task362;

/**
 * Известно, что 1 мм осадков - это один литр воды, вылитый на квадратный метр за 12 часов.
 * Напишите метод static long * determineRainfall(double area, double rainfallAmount), который будет принимать площадь
 * в квадратных километрах и осадки в мм и возвращать количество выпавших осадков за сутки на этой площади.
 *
 * Пример ввода параметров: 8, 12
 * Пример возвращаемого значения: 192000000
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод должен принимать в качестве параметров два числа с плавающей точкой
 * 3. Метод должен возвращать число типа long
 * 4. Метод не должен ничего выводить в консоль
 */
public class Task362 {
    public static void main(String[] args) {
        System.out.println(determineRainfall(8,12));
    }
    public static long determineRainfall(double area, double rainfallAmount) {
        return (long) (rainfallAmount * 2000000 * area);
    }
}
