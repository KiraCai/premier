package src.main.java.Core.task1210;
//NIT импорт лишний
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
        //FIXME проверить для a = 5, b = 3, c = 8
        double aNumber = 5.909870989;
        double bNumber = 8.32458;
        double cNumber = 3.078886;
        double tol = 0.0001;
        System.out.println("правда ли, что a + b = c ?");
        System.out.println(doubleExpression(aNumber, bNumber, cNumber, tol));
    }
    public static boolean doubleExpression(double a, double b, double c, double toleranse) {
        return a + b - c == toleranse;
    }
}
