package src.main.java.prepay.task347;
/**
 *Создайте метод static int sum(int x, int y), который будет принимать два целочисленных параметра и возвращать их сумму.
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод должен принимать два целочисленных параметра
 * 3. Метод должен возвращать целое число
 * 4. Метод должен называться sum
 * 5. Метод не должен ничего выводить в консоль
 */
public class Task347 {
    public static void main(String[] args){
        System.out.println(sum(3,7));
    }
    public static int sum(int x, int y) {
        return x + y;
    }
}
