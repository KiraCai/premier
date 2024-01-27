package src.main.java.Core;

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
    public static void main(String[] args){
    System.out.println(Dog.catchCat(Cat.sfinx));
    }
    public static class Cat {
        static String sfinx;
        public static String sayHello(){
            return "Мяу!";
        }

    }
    public static class Dog {
        public static String sayHello(){
            return "Гав!";
        }
        public static String catchCat(String animals){
            System.out.println("Кошка поймана");
            System.out.println(Dog.sayHello());
            return Cat.sayHello();
        }
    }
}
