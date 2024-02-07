package src.main.java.Core;

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
        System.out.println(Day.isWeekend("MONDAY"));
        System.out.println(Day.isWeekend("SUNDAY"));
        System.out.println(Day.getRusName("TUESDAY"));
    }
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        public static boolean isWeekend(String day){
            return day == Day.SATURDAY.toString() || day == Day.SUNDAY.toString();
        }

        public class Number{
            Number dayType;
            Number (Day da){
                dayType = da;
            }
        }
        public static String getRusName(String dayForRu){
            Number ne = new Number();
            String mon = Day.MONDAY.toString();
            switch(dayForRu) {
                case mon:
                    System.out.println("Low level");
                    break;
                case TUESDAY:
                    System.out.println("Medium level");
                    break;
                case WEDNESDAY:
                    System.out.println("High level");
                    break;
            }
            return "kjh";
        }

        }
    }

