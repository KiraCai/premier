package src.main.java.prepay.task346;

/**
 * Создайте метод static int getMaxInt(), который будет возвращать максимальное значение типа int.
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод не должен ничего принимать
 * 3. Метод должен возвращать максимальное значение int
 * 4. Метод должен называться getMaxInt
 * 5. Метод не должен ничего выводить в консоль
 */
public class Task346 {
    public static void main(String[] args){
        System.out.println(getMaxInt());
    }

    public static int getMaxInt() {
        return Integer.MAX_VALUE;
    }

}
