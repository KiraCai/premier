package src.main.java.Core.task157;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;

/**
 * Цель: Слить два произвольных массива в один отсортированный
 * Что нужно знать:
 * 1. Массивы
 * 2. Циклы
 * 3. Условные операторы
 * Задание:
 * Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает соединяет и сортирует два произвольных массива чисел
 * Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
 * Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 * Пример ввода: {} {1, 4, 3}
 * Пример вывода: [1, 3, 4]
 * Требования:
 * метод должен быть public static
 * сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
 * Не использовать Arrays.
 */
//STATUS-
public class Task157 {
    public static void main(String[] args){
        int[] num = {1, 3, 7, 5};
        int[] mi = {8, 4, 2, 4};
        mergeAndSort(num, mi);
    }
    //FIXME поправить контракт, для вывода на консоль ссылаться на метод из 153
    //FIXME дополинтельно создать метод без использования коллекция и стримов
    //FIXME кодстайл
    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        int aLen = firstArray.length;
        int bLen = secondArray.length;
        int cLen = aLen + bLen;

        //FIXME only english
        int[] naitre = new int[cLen];
        int[] n = new int[cLen];

        //TODO использовать for-each
        for (int i = 0; i < firstArray.length; i++) {
            n[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            n[i+aLen] = secondArray[i];
        }
        int constantaLen = n.length;
        for (int i = 0; i < constantaLen; i++){
            List<Integer> list = Arrays.stream(n).boxed().collect(Collectors.toList());
            List<Integer> copy = list.stream().collect(Collectors.toList());
            Integer mi = Collections.min(list);
            naitre[i] = mi;
            list.removeIf(j -> (j == mi));
            int count = list.size();
            int countCopy = copy.size();
            int delta = countCopy - count;
            if (delta >1){
                delta = delta - 1;
                for (int g = 0; g<delta; g++){
                    list.add(mi);
                }
            }
            n = list.stream().mapToInt(Integer::intValue).toArray();
            System.out.println(naitre[i]);
        }
    }
}
