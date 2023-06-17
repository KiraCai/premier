package src.main.java.Core.task157;

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
public class Task157 {
    public static void main(String[] args){
        int[] num = {1, 3, 7, 5};
        int[] mi = {8, 4, 2, 4};
        mergeAndSort(num, mi);
    }
    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            int[] n = int[firstArray.length + secondArray.length];
            int[i] =
        }
    }
}
