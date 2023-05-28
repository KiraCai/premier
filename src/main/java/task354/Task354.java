package src.main.java.task354;
/**
 *В классе Main создайте метод static void printJavaWord(int count), который будет принимать целочисленный параметр и выводить в консоль слово “Java” равное ему количество раз.
 *
 * Требования:
 * 1. Метод должен иметь модификаторы public static
 * 2. Метод должен принимать в качестве параметра целое число
 * 3. Метод должен выводить в консоль слово Java столько раз, сколько ему передали
 * 4. Метод не должен ничего возвращать
 * 5. Метод должен использовать цикл
 */
public class Task354 {
    public static void main(String[] args){printJavaWord(5);

    }
    public static void printJavaWord(int count) {
        int i = 0;
        while(i < count){
            System.out.println("Java");
            i++;
        }

    }
}
