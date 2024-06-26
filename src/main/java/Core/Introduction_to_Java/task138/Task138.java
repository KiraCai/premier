package src.main.java.Core.Introduction_to_Java.task138;
import java.lang.Integer;
/**
 * Реализуй метод isPowerOfTwo, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 *
 * Решать можно разными способами:
 *
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 * Пример ввода 1: 0
 * Пример возвращаемого значения 1: false
 *
 * Пример ввода 2: 1
 * Пример возвращаемого значения 2: true
 *
 * Пример ввода 3: -2
 * Пример возвращаемого значения 3: true
 *
 * Требования:
 * 1. Метод должен быть public.
 * 2. Метод должен быть static.
 * 3. Передаваемый параметр должен иметь тип int.
 */
public class Task138 {
    public static void main(String[] args){
        int a = 8;
        a = Math.abs(a);
        System.out.println(isPowerOfTwo(a));
    }
    public static boolean isPowerOfTwo(int b){
        return Integer.bitCount(b) == 1;
    }
}
