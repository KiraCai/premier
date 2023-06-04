package src.main.java.Core.task127;

import java.util.Scanner;
import java.util.Locale;

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
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // изменила локаль на точку
        System.out.println("Введите цену");
        double prix = scanner.nextDouble();
        System.out.println("Введите количество");
        int count = scanner.nextInt();
        System.out.println(priceCalculation(prix, count));
    }
    public static double priceCalculation(double doub, int in) {
        return doub * in;
    }
}
/**
 * какая то хуйня
 *
 *
 * public static void main(String[] args){
 *         Scanner scanner = new Scanner(System.in);
 *         String line = scanner.nextLine();
 *         System.out.println(priceCalculation(line));
 *     }
 *     public static int priceCalculation(String linel) {
 *         String[] myArray = linel.split("\\s");
 *         int[] values = new int[myArray.length];
 *         for (int i = 0; i < myArray.length; i++) {
 *             values[i] = Integer.parseInt(myArray[i]);
 *         }
 *         return Integer.toString(values);
 *     }
 */