package src.main.java.Core.Introduction_to_Java.task168;

/**
 * Реализуйте метод:
 * public void parseAndPrintNumber(String str) {
 * }
 * Требования:
 * Метод не должен быть статическим.
 * Метод не должен ничего возвращать.
 * Метод принимает в качестве параметра строку, например "1234".
 * Метод должен получать из строки число типа int, делить его на 2 и выводить его в консоль, используя System.out.println.
 * Примеры:
 * Пример ввода: "1200"
 * Пример вывода: 600
 */
public class Task168 {
    public static void main (String[] args) {
        String st = "1200";
        parseAndPrintNumber(st);
    }
    public static void parseAndPrintNumber(String str) {
        int number = Integer.parseInt(str);
        System.out.println(number/2);
    }
}
