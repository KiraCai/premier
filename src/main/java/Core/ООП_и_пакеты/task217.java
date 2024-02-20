package src.main.java.Core.ООП_и_пакеты;

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
        Day day = Day.SUNDAY;
        System.out.println(day.isWeekend());
        /*System.out.println(Day.isWeekend("SUNDAY"));
        System.out.println(Day.getRusName("THURSDAY"));*/
    }
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        public boolean isWeekend(){
            switch (Day) {
                case SUNDAY:
                    System.out.println("Воскресный обед! Сегодня можно даже немного сладкого");
                    break;
            //return day == Day.SATURDAY.toString() || day == Day.SUNDAY.toString();
        }

        public String getRusName(String dayForRu){
            Day dayObject = Day.valueOf(dayForRu);
            switch(dayObject) {
                case MONDAY:
                    return "Понедельник";
                case TUESDAY:
                    return "Вторник";
                case WEDNESDAY:
                    return "Среда";
                case THURSDAY:
                    return "Четверг";
                case FRIDAY:
                    return "Пятница";
                case SATURDAY:
                    return "Суббота";
                case SUNDAY:
                    return "Воскресенье";
            }
            return "такого дня нет";
        }

        }
    }

