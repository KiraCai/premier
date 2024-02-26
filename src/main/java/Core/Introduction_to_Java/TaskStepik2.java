package src.main.java.Core.Introduction_to_Java;
import java.math.BigInteger;
/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Поскольку это очень быстро растущая функция, то даже для небольших
�
N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 */
public class TaskStepik2 {
    public static void main(String[] args){
        int val = 1;
        System.out.println(factorial(val));
    }
    public static BigInteger factorial(int value) {

        // convert int to Integer

        int fin = 1;

        for (int i =0; i<value; i++) {
            fin = i * (i +1);
        };
        Integer integer = Integer.valueOf(fin);

        //BigInteger val = BigInteger.valueOf(integer); // works
        BigInteger val = BigInteger.valueOf(integer.intValue());
        if (value == 1){

            Integer integ = Integer.valueOf(value);
            BigInteger vale = BigInteger.valueOf(integ.intValue());

            return vale;
        }
        return val;
    }
}
