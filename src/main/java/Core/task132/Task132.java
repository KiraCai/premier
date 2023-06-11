package src.main.java.Core.task132;

import java.util.Arrays;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 *
 * Требования:
 * 1. Сигнатура метода должна быть: charExpression(int a)
 */
public class Task132 {
    public static void main(String[] args){
        int integer = 61;
        System.out.println(charExpression(integer));
    }
    public static String charExpression(int integerInput) {
        int reversConst = 92;
        char[] character = Character.toChars(integerInput + reversConst);
        return Arrays.toString(character);
    }
}
