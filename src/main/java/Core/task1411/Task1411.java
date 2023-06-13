package src.main.java.Core.task1411;

/**
 * Цель: Работа с оператором if/else
 *
 * Что нужно знать:
 *
 * 1. Оператор if
 *
 * Задание:
 * Реализовать метод, который будет принимать строку с названием дня недели, и отвечать, является ли этот день  выходным.
 * Список дней недели:
 * "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday".
 * Если строка не соответствует ни одному дню недели отправлять false.
 *
 * Пример ввода: Monday
 * Пример вывода: false
 * Пример ввода: Saturday
 * Пример вывода: true
 * Требования:
 * метод должен быть public static
 * сигнатура метода isWeekend(String weekDay)
 * метод возвращает boolean
 * решить с использование оператора if
 */
public class Task1411 {
    public static void main(String[] args) {
        String day = "Tuesday";
        System.out.println(isWeekend(day));
    }
    public static boolean isWeekend(String weekday) {
        //NIT можно не объявлять а сразу возвращать внутри ветвления
        boolean boo = false;
        if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            boo = true;
            //FIXME кодстайл
        } else { boo = false;
        }
        return boo;
    }
}
