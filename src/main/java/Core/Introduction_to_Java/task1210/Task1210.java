package src.main.java.Core.Introduction_to_Java.task1210;

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
        double aNumber = 5;
        double bNumber = 3;
        double cNumber = 8;
        double tol = 0.0001;
        System.out.println("правда ли, что a + b = c ?");
        System.out.println(doubleExpression(aNumber, bNumber, cNumber, tol));
    }
    public static boolean doubleExpression(double a, double b, double c, double toleranse) {
        return a + b - c <= toleranse;
    }
}
