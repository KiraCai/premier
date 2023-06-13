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
    //спасибо)
    public static int determineGroup(int age) {
            int youngGroupMinAge = 7;
            int youngGroupMaxAge = 13;
            
            int middleGroupMinAge = 14;
            int middleGroupMaxAge = 17;
            
            int oldGroupMinAge = 18;
            int oldGroupMaxAge = 65;

            if (youngGroupMinAge<=age && age <= youngGroupMaxAge) {
                return 1;
            }

            if (middleGroupMinAge<=age && age <= middleGroupMaxAge) {
                return 2;
            }

            if (oldGroupMinAge<=age && age <= oldGroupMaxAge) {
                return 3;
            }

            return -1;
    }
}
