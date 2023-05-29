package src.main.java.prepay.task3103;
/**
 * Cоздайте public static (мы делаем класс статическим исключительно для корректной работы проверяющей системы)
 * класс Human, содержащий поля String name и int age.
 *
 * У класса Human должен быть метод public void sayHello(), который выводит в консоль, “Привет, меня зовут {name}, мне {age} лет.”.
 *
 * В методе main создайте объект класса Human, заполните его поля и вызовите метод sayHello().
 *
 * Требования:
 * 1. Класс Human должен иметь поля String name и int age
 * 2. В классе Human должен быть публичный конструктор конструирующий поля String name и int age
 * 3. Метод sayHello() не должен ничего возвращать
 * 4. В методе main должен быть создан объект класса Human
 * 5. Поля объекта должны быть заполнены
 * 6. У объекта класса Human должен быть вызван метод sayHello()
 * 7. Класс Human должен быть статическим, метод main находится вне этого класса
 */
public class Main {
    static Task3103 human = new Task3103();
    static public void main(String[] args) {
        human.age;
        human.name;
        System.out.println(human);
    }
}
public class Task3103 {
    String name = "Денис";
    int age = 8;
    Task3103 human;
    @Override
    public String toString() {
        return super.toString("Привет, меня зовут " + name + ", мне" + age + "лет.");
    }
}
