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
        System.out.println(dayOfWeek.getRusName());
        System.out.println(dayOfWeek.isWeekend());
    }

    public enum Day{
        MONDAY("Понедельник", false),
        TUESDAY("Вторник", false),
        WEDNESDAY("Среда", false),
        THURSDAY("Четверг", false),
        FRIDAY("Пятница", false),
        SATURDAY("Суббота", true),
        SUNDAY("Воскресенье", true);

        private String rusName;
        private Boolean weekendName;


        Day(String rusName, Boolean weekendName) {
            this.rusName = rusName;
            this.weekendName = weekendName;
        }
        public String getRusName() {
            return rusName;
        }
        public Boolean isWeekend(){ return weekendName; }
        }
    }

