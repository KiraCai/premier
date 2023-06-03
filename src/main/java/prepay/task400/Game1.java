package src.main.java.prepay.task400;

import java.util.Scanner;

/**
 * Реализовать игру, определяющая загаданное игроком целое число.
 * При запуске игры вводится диапозон, в котором лежит загаданное число.
 * Далее игра выводит число, спрашивая, верное ли оно, либо загаданное больше/меньше выведенного.
 * Когда игра число угадает, она должна вывести в консоль за какое количество попыток число было угадано.
 * Программа должна быть написано так, чтобы свести количество попыток к минимуму.
 * Пример вывода в консоль:
 Старт игры
 Введите нижний предел
 >10
 Введите верхний предел
 >50
 Загаданное число - 19? (Верно/Меньше/Больше)
 >Больше
 Загаданное число - 29? (Верно/Меньше/Больше)
 >Верно
 Загаданное число 29. Определено за 2 попытки
 Конец игры
 */
public class Game1 {
    //FIXME Первые две попытки угадать - одно и тоже число. Можно первую попытку тоже делать внутри while, задав answerNext = "";
    // Условие answerNext.equals("Больше") || answerNext.equals("Меньше") эквивалентно !answerNext.equals("Верно")
    // Кодстайл для if-else
    // Имя getNumber не отражает все таки смысл метода, как вариант getAverageNumber
    // В методе getNumber сразу возвращать результат без объявления переменной

    //NIT можно использовать пустые строки для группирования частей алгоритмы по смыслу и облегчения чтения (но не злоупотреблять)
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт игры");
        System.out.println("Введите нижний предел");
        int lowLim = scanner.nextInt();
        System.out.println("Введите верхний предел");
        int highLim = scanner.nextInt();
        int num = getNumber(lowLim, highLim);
        System.out.println(" Загаданное число - " + num + " ? (Верно/Меньше/Больше)");
        String answerNext = scanner.next();
        if (answerNext.equals("Больше") || answerNext.equals("Меньше")) {
            while (answerNext.equals("Больше") || answerNext.equals("Меньше")) {
                count ++;
                System.out.println("Загаданное число - " + num + " ? (Верно/Меньше/Больше)");
                answerNext = scanner.next();
                if (answerNext.equals("Больше")) {
                    lowLim = num;
                    num = getNumber(lowLim, highLim);
            }
                else {
                    highLim = num;
                    num = getNumber(lowLim, highLim);
            }
        }
            System.out.println("Загаданное число" + num + ". Определено за " + (count -1)  + " попытки");}
        else {
            System.out.println("Загаданное число" + num + ". Определено за " + count + " попытку");
        }
    }
    public static int getNumber(int low, int high){
        int number = ((high-low)/2)+low;
        return number;
    }
}