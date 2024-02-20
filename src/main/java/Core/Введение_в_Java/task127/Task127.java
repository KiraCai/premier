package src.main.java.Core.Введение_в_Java.task127;

import java.util.Scanner;

/**
 * Напишите публичный метод priceCalculation, который считает стоимость товара.
 * В метод передается цена товара (может быть дробной) и количество товара, метод должен возвращать итоговую цену покупки.
 *
 * Пример ввода: 8.50, 2
 * Пример вывода: 17.0
 *
 * Требования:
 * Сигнатура метода должна быть: priceCalculation(double price, int count)
 */
public class Task127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(priceCalculation(line));
    }

    public static double priceCalculation(String linel) {
        String[] myArray = linel.split("\\s");
        double[] values = new double[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            values[i] = Double.parseDouble(myArray[i]);
        }
        return values[0]*values[1];
    }
}