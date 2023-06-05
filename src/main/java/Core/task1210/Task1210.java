package src.main.java.Core.task1210;

import java.math.BigDecimal;

/**
 * Урок с кодом
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 *
 * Требования:
 * Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)
 */
public class Task1210 {
    public static void main(String[] args){
        BigDecimal aNumber = BigDecimal.valueOf(5.909870989);
        BigDecimal bNumber = BigDecimal.valueOf(8.32458);
        BigDecimal cNumber = BigDecimal.valueOf(3.078886);
        int zero = 0;
        System.out.println("правда ли, что a + b = c ?");
        if (doubleExpression(aNumber, bNumber, cNumber) == zero) {
            System.out.println("True");
        } else {System.out.println("False");
        }
    }
    public static int doubleExpression(BigDecimal a, BigDecimal b, BigDecimal c) {
        BigDecimal summaAB = a.add(b);
        BigDecimal deltaStatic = BigDecimal.valueOf(0.0001);
        BigDecimal differenceBetween_A_B_And_C = summaAB.subtract(c);
        return differenceBetween_A_B_And_C.compareTo(deltaStatic);
    }
}
