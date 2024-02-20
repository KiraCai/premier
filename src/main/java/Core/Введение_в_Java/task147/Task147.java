package src.main.java.Core.Введение_в_Java.task147;

import java.math.BigInteger;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 *
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
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
 * 4. Метод должен быть реализован через цикл.
 */
public class Task147 {
    public static void main(String[] args){
        int a = 5;
        System.out.println(factorial(a));
    }
    public static BigInteger factorial(int value) {
        BigInteger count = new BigInteger("1");
        int counter = 2;
        while (counter<=value){
            BigInteger one = new BigInteger("1");
            BigInteger big = BigInteger.valueOf(counter);
            count = count.multiply(big);
            counter++;
        }
        return count;
    }
}
