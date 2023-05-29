package src.main.java.prepay.task393;

/**
 * Cоздайте метод static int[] fillArray(int x), который принимает целое число и возвращает массив целых чисел,
 * размером равный этому числу и заполненный числами от 0 до числа, меньшего на единицу, чем принятое.
 *
 * Пример ввода параметра: 3
 * Пример возвращаемого массива: [0,1,2]
 *
 * Требования:
 * 1. Метод должен принимать целое число
 * 2. Метод не должен ничего выводить в консоль
 * 3. Метод должен возвращать массив целых чисел
 */
public class Task393 {
    public static void main(String[] args){
        int [] arrayPrint = fillArray(7);
        for(int i = 0; i< arrayPrint.length; i++){
            System.out.print(arrayPrint[i]);
        }
    }
    public static int[] fillArray(int x){
        int[] array = new int[x];
        for(int i = 0; i < array.length;i ++){
            array[i] = i;
        }
        return array;
    }
}
