package src.main.java.Core.OOP_et_packages.task219;

/*
Реализация equals() и hashCode()
Дан класс ComplexNumber. Переопределив нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры
ComplexNumber по содержимому полей re и im, а hashCode() был согласованным с реализацией equals().
Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
Пример
ComplexNumber a = new ComplexNumber(1, 1);
ComplexNumber b = new ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()
Подсказка 1. Поищи в классе java.lang.Double статический метод, который поможет в решении задачи.

Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки,
которая умеет сама генерировать equals() и hashCode(). Если ты воспользовался помощью IDE,
разберись, что было сгенерировано и почему оно выглядит именно так. Когда тебя на собеседовании попросят
на бумажке реализовать equals() и hashCode() для какого-нибудь простого класса, то среда разработки помочь не сможет.
Требования:
1. Должен быть класс public static class ComplexNumber.
2. Класс ComplexNumber должен иметь поля re и im типа double.
3. Класс ComplexNumber должен переопределять public boolean equals(Object o) и public int hashCode().
4. equals и hashcode должны корректно работать.
 */
public class task219 {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2.127, 1);
        ComplexNumber b = new ComplexNumber(2.789, 1);
        System.out.println(a.equals(b));
        if(a.hashCode() == b.hashCode()){
          System.out.println("true");
        } else {System.out.println("false");}

    }

}
