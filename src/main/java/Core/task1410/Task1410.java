package src.main.java.Core.task1410;

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
        String s = "end";
        switch (weekday){
            case "Monday":
                s = "end";
                break;
            case "Tuesday":
                s = "end";
                break;
            case "Wednesday":
                s = "end";
                break;
            case "Thursday":
                s = "end";
                break;
            case "Friday":
                s = "end";
                break;
            case "Saturday":
                s = "weekend";
                break;
            case "Sunday":
                s = "weekend";
                break;
        } return s.equals("weekend");
    }
}
