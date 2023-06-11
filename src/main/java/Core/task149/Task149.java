package src.main.java.Core.task149;

/**
 * В спортивном центре есть три возрастные группы для занятий волейболом 1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.
 *
 *  Напишите публичный нестатичный метод determineGroup который принимает возраст человека и возвращает целое число,
 *  которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните -1.
 *
 * Пример ввода: 10
 * Пример вывода: 1
 *
 * Пример ввода: 60
 * Пример вывода: 3
 *
 * Пример ввода: 77
 * Пример вывода: -1
 * Требования:
 * Сигнатура метода должна быть: determineGroup(int age)
 * Метод должен возвращать int
 * Метод не должен быть статическим
 */
public class Task149 {
    public static void main(String[] args) {
        int age = 70;
        System.out.println(determineGroup(age));
    }
    public static int determineGroup(int ag) {
            int a = 7;
            int b = 13;
            int c = 14;
            int d = 17;
            int e = 18;
            int f = 65;
            int result = -1;
            if (a<=ag && ag <= b) {
                result = 1;
            } else if (c<=ag && ag <= d) {
                result = 2;
            } else if (e<=ag && ag <= f) {
                result = 3;
            }
        return result;
    }
}
