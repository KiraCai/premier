package src.main.java.Core.OOP_et_packages;

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
    private double re;

    private double im;

    public task219() {

    }

    public static void main(String[] args) {
        task219 a = new task219(1, 1);
        task219 b = new task219(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode(b));
    }

    public task219(double re, double im) {

        this.re = re;

        this.im = im;

    }

    public boolean equals(Object o) {

        if (getClass() != o.getClass()) return false;
        task219 other = (task219) o;

        if (java.lang.Double.compare(this.re, other.getRe()) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode(Object p) {
        Long hashLong = java.lang.Double.doubleToLongBits(this.re);
        System.out.println(hashLong);
        if (getClass() != p.getClass()) return 0;
        task219 otherP = (task219) p;
        Long hashLongB = java.lang.Double.doubleToLongBits(otherP.getRe());
        System.out.println(hashLongB);
        if (hashLong.equals(hashLongB)) {
            return 1;
        }
        return 0;
    }

    public double getRe() {

        return re;

    }

    public double getIm() {

        return im;

    }

}
