package src.main.java.prepay.task381;

import java.util.Scanner;

/**
 * Создайте метод public static int getMinFromTwo(int x, int y), который принимает два целочисленных параметра и
 * возвращает наименьший из них.
 *
 * Создайте метод public static int getMinFromFour(int x, int y, int m, int n),
 * который принимает четыре целочисленных параметра и возвращает наименьший из них.
 *
 * При том  второй метод должен использовать первый.
 *
 * Требования:
 * 1. Оба метода должны принимать целочисленные параметры
 * 2. Оба метода должны возвращать целочисленные параметры
 * 3. Второй метод должен использовать первый
 * 4. Методы не должны ничего выводить в консоль
 */
import java.util.Scanner;
public class Task381 {
    public static void main(String[] args){
        int x = 5;
        int y = 6;
        System.out.println(getMinFromTwo(x, y));
        System.out.println(getMinFromFour(x, y, 8,2));
    }
    public static int getMinFromTwo(int x, int y){
        return Math.max(x, y);
    }
    public static int getMinFromFour(int x, int y, int m, int n){
        int max2 = Math.max(m, n);
        return Math.max(getMinFromTwo(x, y), max2);

    }
}
