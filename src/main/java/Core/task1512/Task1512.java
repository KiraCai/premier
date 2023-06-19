package src.main.java.Core.task1512;

import java.util.Arrays;
import java.util.List;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую.
 * Конец вывода должен перевести курсор на новую строку.
 * Пример ввода: [3,5,20,8,7,3,100]
 * Пример вывода: 3,5,7,3
 * Требования:
 * Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */
public class Task1512 {
    public static void main(String[] args) {
        int[] num = {3,5,20,8,7,3,100};
        printOddNumbers(num);
        int[] res = printOddNumbers(num);
        List<int[]> list = Arrays.asList(res);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static int[] printOddNumbers(int[] arr) {
        return Arrays.stream(arr).filter(numb -> numb%2 != 0).toArray();
    }
}