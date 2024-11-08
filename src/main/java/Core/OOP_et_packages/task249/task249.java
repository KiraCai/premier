package src.main.java.Core.OOP_et_packages.task249;

/*Создание класса наследника
Цель: Создание класса наследника
Что нужно знать:
1. Как создавать классов наследников в Java
2. Ключевое слово super
Задание:
Давайте представим, что у нас есть студенты, описанные данным классом:
деятельность которых ограничена учением. Как ты мог заметить этот класс описывает еще не поступившего
на конкретное направление студента.
Создай на его основе класс JavaStudent, который будет учиться на направлении Java.
Требования:
1. класс JavaStudent должен быть public static
2. класс JavaStudent должен быть наследником Student.
3. класс JavaStudent должен иметь только один публичный конструктор — конструктор без параметров.
4. класс JavaStudent не должен иметь новых методов или переопределять существующие.
5. Метод study() вызванный у объектов JavaStudent должен выводить в консоль сообщение "Я очень занят.
 Прохожу курс по Java."
 */
public class task249 {
    public static class Student {

        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    /*public static void main(String[] args) {

        JavaStudent studJ = new JavaStudent(String "mnjhgf");
        System.out.println(studJ.studying);
        studJ.study();
        return;
    }*/

    }
    public static class JavaStudent extends Student{
        public JavaStudent(){
            super();
        }
        public static void main(String[] args) {

            JavaStudent studJ = new JavaStudent();
            System.out.println(studJ.studying);
            studJ.study();
            return;
        }

    }
}
