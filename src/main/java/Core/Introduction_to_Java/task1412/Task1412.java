package src.main.java.Core.Introduction_to_Java.task1412;

/**
 * Цель: Работа с тернарным оператором
 * Что нужно знать:
 * 1. Тернарный оператор
 * Задание:
 * Реализовать метод, который будет принимать строку с названием дня недели, и проверять, является ли этот день  выходным.
 * Список дней недели:
 * "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday".
 * Если переданная строка является выходным днем, то возвращать строку:
 * "Ура, выходной!". В других случаях возвращать строку "Надо еще поработать".
 * Пример ввода: "Monday"
 * Пример вывода: "Надо еще поработать"
 * Пример ввода: "Sunday"
 * Пример вывода: "Ура, выходной!"
 * Требования:
 * метод должен быть public static
 * сигнатура метода checkWeekend(String weekday)
 * метод возвращает String
 * решить с использованием тернарного оператора
 */
public class Task1412 {
    public static void main(String[] args) {
        String day = "Saturday";
        System.out.println(checkWeekend(day));
    }
    public static String checkWeekend(String weekday) {
        return (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо ещё поработать";
    }
}
