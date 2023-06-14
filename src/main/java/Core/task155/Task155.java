package src.main.java.Core.task155;

/**
 * Цель: Вернуть середину массив
 * Что нужно знать:
 * 1. Массивы
 * 2. Условные операторы
 * 3. Циклы
 * Задание:
 * Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины,
 * то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
 * Пример ввода: {1, 5, 2, 17}
 * Пример вывода: [5, 2]
 * Пример ввода: {14, 16, 3}
 * Пример вывода: [16]
 * Пример ввода: {}
 * Пример вывода: []
 * Требования:
 * Метод должен быть public static
 * Сигнатура метода getArrayMiddle(int[] numbers)
 * Не использовать Arrays, System.arrayCopy
 */
public class Task155 {
    public static void main(String[] args){
        int[] numbers = {1,3,5,6,7,9,11,24};
          getArrayMiddle(numbers);
        }
    public static void getArrayMiddle(int[] numbers) {
        System.out.print('[');

        if (numbers.length % 2 == 0) {
            System.out.print(numbers[(numbers.length - 2) / 2] + ", " + numbers[numbers.length / 2]);
        } else {
            System.out.print(numbers[numbers.length / 2]);
        }
        System.out.print(']');
    }
}
