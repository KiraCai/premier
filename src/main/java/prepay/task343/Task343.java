package src.main.java.prepay.task343;
/**
 * Создайте метод static void printHello(String name), который будет принимать в качестве параметра имя и выводить в консоль строку “Hello {name}!”, где вместо {name} будет переданный параметр.
 *
 * Пример ввода параметра: "Nikita"
 * Пример вывода: Hello Nikita!
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод должен принимать строку
 * 3. Метод должен выводить в консоль строку “Hello {name}!”
 * 4. Метод не должен ничего возвращать
 */
public class Task343 {
    public static void main(String[] args) {
        printHello("Nikita");
    }
    public static void printHello(String name) {
        String h = "Hello " +  name;
        System.out.println(h);
    }
}
