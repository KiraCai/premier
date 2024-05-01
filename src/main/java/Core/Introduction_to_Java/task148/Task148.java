package src.main.java.Core.Introduction_to_Java.task148;

/**
 * Реализуйте предыдущую задачу с использованием рекурсии.
 *
 * Пример ввода 1: 1
 * Пример возвращаемого значения 1: 1
 *
 * Пример ввода 2: 3
 * Пример возвращаемого значения 2: 6
 *
 * Требования:
 * 1. Метод должен быть public.
 * 2. Метод должен быть static.
 * 3. Передаваемый параметр должен иметь тип int.
 * 4. Реализация метода должна быть через рекурсию.
 */
public class Task148 {  // честно подсмотренно, смысл в том что факториал метод засунут внутрь себя и вызывает себя
    public static void main(String[] args){
         int a = 8;
         System.out.println(factorial(a));
    }
    public static int factorial(int value) {
        int result;
        if (value < 2) {
            return 1;
        }
        result = factorial(value - 1) * value;
        return result;
    }
}
