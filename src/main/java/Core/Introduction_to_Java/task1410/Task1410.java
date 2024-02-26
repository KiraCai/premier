package src.main.java.Core.Introduction_to_Java.task1410;

/**
 * Цель: Работа с оператором switch
 * Что нужно знать:
 * 1. Оператор switch
 *
 * Задание:
 * Реализовать метод, который будет принимать строку с названием дня недели, и отвечать, является ли этот день  выходным. Список дней недели:
 * "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday". Если строка не соответствует ни одному дню недели отправлять false.
 * Пример ввода: Monday
 * Пример вывода: false
 * Пример ввода: Saturday
 * Пример вывода: true
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода isWeekend(String weekDay)
 * метод возвращает boolean
 * решить с использование оператора switch
 */
public class Task1410 {     //можно было сделать проще
    public static void main(String[] args){
        String day = "Sunday";
        System.out.println(isWeekend(day));
    }
    public static boolean isWeekend(String weekday) {
        boolean boo = false;
        switch (weekday){
            case "Monday":
                boo = false;
                break;
            case "Tuesday":
                boo = false;
                break;
            case "Wednesday":
                boo = false;
                break;
            case "Thursday":
                boo = false;
                break;
            case "Friday":
                boo = false;
                break;
            case "Saturday":
                boo = true;
                break;
            case "Sunday":
                boo = true;
                break;
        }
        return boo;
    }
}
