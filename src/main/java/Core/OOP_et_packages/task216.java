package src.main.java.Core.OOP_et_packages;

/*
Объявление класса
Задание:
Создайте класс Cat и класс Dog. В классе Cat должен быть метод sayHello(),
 который выводит в консоль «Мяу!», аналогично с собакой, но выводит «Гав!».
 Также у собаки должен быть метод catchCat (поймать кошку), который принимает кошку и дальше делает следующее:
1) Выводит в консоль сообщение «Кошка поймана».
2) У собаки, которая поймала кошку, должен быть вызван метод sayHello().
3) У кошки, которую поймала собака, должен быть вызван метод sayHello().
Требования:
1. Должен быть класс public static class Cat.
2. Должен быть класс public static class Dog.
3. Все методы должны быть public.
4. Кошка должна говорить «Мяу!»
5. Собака должна говорить «Гав!»
6. Собака должна ловить кошку.
 */

public class task216 {
    public static void main(String[] args) {
        Cat mia = new Cat();
        Dog lia = new Dog();
        System.out.println(lia.catchCat(mia));
    }

    public static class Cat {
        public static String sayHello() {
                System.out.println("Мяу!");
                return "";
        }

    }

    public static class Dog {
        public static String sayHello() {
            System.out.println("Гав!");
            return "";
        }

        public static String catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            Dog.sayHello();
            cat.sayHello();
            return "";
        }
    }
}
