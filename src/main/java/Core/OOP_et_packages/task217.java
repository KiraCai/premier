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
        var dayOfWeek = Day.SUNDAY;
        switch (dayOfWeek) {
            case SUNDAY:
                dayOfWeek.isWeekend();
                break;
            case MONDAY:
                System.out.println("не выходной");
                break;
            case TUESDAY:
                System.out.println("не выходной");
                break;
            case WEDNESDAY:
                System.out.println("не выходной");
                break;
            case THURSDAY:
                System.out.println("не выходной");
                break;
            case FRIDAY:
                System.out.println("не выходной");
                break;
            case SATURDAY:
                dayOfWeek.isWeekend();
                break;

        }
    }

    public enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        public boolean isWeekend(){
            System.out.println("Выходной");
            return true;
        }

        /*public String getRusName(){
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
        }*/}
    }

