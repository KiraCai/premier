package src.main.java.Core.Introduction_to_Java;
import java.util.Arrays;


/*
На вход подаётся массив чисел и некоторое число X.
Нужно определить индексы двух чисел в массиве, сумма которых равна X.
Должен выводиться массив с этими двумя индексами. Если таких чисел нет, выводится пустой массив.
Предполагается, что существует единственная такая пара чисел в массиве, либо не существует вообще
Например, если в массиве у нас (2, 4, 5, 1, 8), а число — 5, то ответом будет [1, 3]
 */
public class Leonid11 {
    public static void main(String[] args){
        int[] array = new int[] {2, 4, 5, 1, 8};
        int numX = 5;
        int[] array1 = new int[] {2, 4, 5, 9, 8};
        int numX1 = 5;
        System.out.println(Arrays.toString(getSum(array, numX)));
        System.out.println(Arrays.toString(getSum(array1, numX1)));
    }
    public static int[] getSum(int[] a, int b){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
