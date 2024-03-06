package src.main.java.Core.OOP_et_packages;

/*
Работа с Enum
Цель: научиться создавать перечисления (Enum).
Что нужно знать:
1. Enum
Задание:
Реализовать Enum Day, который будет отвечать за дни недели. Этот Enum должен содержать следующие элементы:
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
Также в этом Enum должны быть релизованы два метода:
1. public boolean isWeekend() — метод, отвечающий на вопрос, является ли конкретный элемент выходным днем.
 Выходными днями являются только суббота и воскресенье.
2. public String getRusName() — метод, возвращающий русское название дня недели.
Требования:
Enum должен иметь название Day.
Enum должен содеражить элементы на каждый день недели.
Сигнатура метода isWeekend().
метод isWeekend возвращает boolean.
Сигнатура метода getRusName().
Метод getRusName возвращает String.
 */

public class task217 {
    public static void main(String[] args){
        Day day1 = Day.SUNDAY;
        System.out.println(day1.isWeekend(day1));
        System.out.println(day1.getRusName(day1));
        Day day2 = Day.MONDAY;
        System.out.println(day2.isWeekend(day2));
        System.out.println(day2.getRusName(day2));
    }

    public enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        public boolean isWeekend(Object da){
            return da == Day.SATURDAY || da == Day.SUNDAY; //tr == Day.SATURDAY.toString() || tr == Day.SUNDAY.toString();
        }

        public String getRusName(Object dayForRu){
            String dayString = String.valueOf(dayForRu); //.toString(dayForRu); //Day.valueOf(dayForRu);
            switch(dayString) {
                case "MONDAY":
                    return "Понедельник";
                case "TUESDAY":
                    return "Вторник";
                case "WEDNESDAY":
                    return "Среда";
                case "THURSDAY":
                    return "Четверг";
                case "FRIDAY":
                    return "Пятница";
                case "SATURDAY":
                    return "Суббота";
                case "SUNDAY":
                    return "Воскресенье";
            }
            return "такого дня нет";
        }}
    }

