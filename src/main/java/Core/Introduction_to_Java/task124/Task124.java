package src.main.java.Core.Introduction_to_Java.task124;

/**
 * Задание «Объявление примитивных типов данных»
 *
 * Цель: научиться объявлять переменные
 *
 * В методе main (точка входа в программу) объяви переменные всех простых (примитивных) типов.
 * Проинициализируй их значениями, отличными от значений по умолчанию (измени значение переменных).
 *
 * Требования:
 *
 * 1. Переменные должны находиться внутри метода main.
 *
 * 2. В методе main должны быть переменные всех простых типов.
 *
 * 3. В методе main должны быть переменные только простых типов.
 *
 * 4. Значения переменных должны отличаться от значений по умолчанию.
 *
 * 5. Переменные должны иметь имя var + тип примитива без пробелов и подчеркиваний,
 * например, переменная типа int должна называться varint
 */
public class Task124 {
    public static void main(String[] args) {
        int varint = 5;
        boolean varboolean = false;
        byte varbyte = 120;
        short varshort = 32_000;
        long varlong = 7_000_000_433L;
        double vardouble = 7.53453;
        float varfloat = 9.4322F;
        char varchar = '&';
        System.out.println(varint);
        System.out.println(varboolean);
        System.out.println(varbyte);
        System.out.println(varshort);
        System.out.println(varlong);
        System.out.println(vardouble);
        System.out.println(varfloat);
        System.out.println(varchar);
    }
}
