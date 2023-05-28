package src.main.java.prepay.task344;
/**
 * В классе Main создайте метод static void printDivisionResult(double x, double y), который будет принимать два числа с плавающей точкой и выводить в консоль результат деления первого на второе.
 *
 * Пример ввода параметров: 5.50, 2.25
 * Пример вывода: 2.4444444444444446
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод должен принимать в качестве параметров два числа с плавающей точкой
 * 3. Метод должен выводить в консоль результат деления
 * 4. Метод не должен ничего возвращать
 */
public class Task344 {
    public static void main(String[] args) {
        printDivisionResult(5.464554, 7.98876);
    }
    public static void printDivisionResult(double x, double y) {
        double c = 0;
        c = x/y;
        System.out.println(c);
    }
}
