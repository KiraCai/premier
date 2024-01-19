package src.main.java.Core;
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
        int[] massiv = new int[] {2, 4, 5, 1, 8};
        int numX = 5;
        int[] massiv1 = new int[] {2, 4, 5, 9, 8};
        int numX1 = 5;
        int[] massiv2 = new int[] {2, 4, 5, 9, 8};
        int numX2 = 7;
        System.out.println(Arrays.toString(ArraySum(massiv, numX)));
        System.out.println(Arrays.toString(ArraySum(massiv1, numX1)));
        System.out.println(Arrays.toString(ArraySum(massiv2, numX2)));
    }
    public static int[] ArraySum(int[] a, int b){
        int[] arrSum = new int[2];
        //создадим новый массив вычев из пяти все значения и сравним с массивом какое совпадет то и берём
        int count = 0;
        for(int j = 0; j<a.length; j++){
            for(int f = 0; f<a.length; f++){
                if(a[j] + a[f] == b){
                    arrSum[count] = j;
                    count++;
                    if(count == 2){
                        break;
                    }
                }
            }
            if(count == 2){
                break;
            }
        }
        if (arrSum[1] == 0){
            int[] arrVide = new int[0];
            return arrVide;
        }
        return arrSum;
    }
}
