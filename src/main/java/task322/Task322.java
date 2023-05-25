package src.main.java.task322;

/**
 * В методе main (точка входа в программу) объявите переменные всех простых(примитивных) типов.Проинициализируйте
 * их значениями отличными от значений по умолчанию.
 *
 * Требования:
 * 1. Переменные должны находиться внутри метода main
 * 2. В методе main должны быть переменные всех простых типов
 * 3. В методе main должны быть переменные только простых типов
 * 4. Значения переменных должны отличаться от значений по умолчанию
 * 5. Переменные должны иметь имя var + тип примитива без пробелов и подчеркиваний (например, переменная типа int должна называться varint)
 */
public class Task322 {

    public static void main(String[] args) {
        byte varbyte = 56;
        short varshort = 31000;
        int varint = 65399990;
        long varlong = 908435098530948L;
        char varchar = 'r';
        float varfloat = 89.390485092f;
        double vardouble = 54.03943;
        boolean varboolean = true;

        System.out.println(varbyte);
        System.out.println(varshort);
        System.out.println(varint);
        System.out.println(varlong);
        System.out.println(varchar);
        System.out.println(varfloat);
        System.out.println(vardouble);
        System.out.println(varboolean);
    }
}
