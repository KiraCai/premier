package src.main.java.prepay.task355;

// NIT По возможности текст не должен выходить за границы
/**
 * Создайте метод static boolean determineAdult(int age), который будет принимать возраст человека и возвращать логическое значение,
 * равное true если он 18 и больше и false если он меньше 18,
 * если переданное число меньше 0, метод должен вывести в консоль “Ошибка! Введите правильный возраст.” и вернуть false.
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод должен принимать в качестве параметра целое число
 * 3. Метод должен возвращать логическое значение
 */
public class Task355 {
    public static void main(String[] args){
        System.out.println(determineAdult(6));
    }

    //FIXME
    // Имя переменной должно отражать смысл значения. Проинициалиировать сразу условием (bool b = "condition").
    // Определить условие в конструкции if-else так, чтобы не пришлось использовать 'else if'
    public static boolean determineAdult(int age) {
        boolean bool = false;
        if (age>= 18){
            bool = true;
        } else if (age <0) {
            System.out.println("Ошибка! Введите правильный возраст.");
        }
        return bool;
    }

}
