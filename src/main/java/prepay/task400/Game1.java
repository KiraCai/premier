package src.main.java.prepay.task400;

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
import java.util.Scanner;
public class Game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт игры");
        System.out.println("Введите нижний предел");
        int lowLim = scanner.nextInt();
        System.out.println("Введите верхний предел");
        int highLim = scanner.nextInt();
        int num = whatsNumber(lowLim, highLim);
        System.out.println(" Загаданное число - " + num + " ? (Верно/Меньше/Больше)");
        String answerNext = scanner.nextLine();

        if ( answerNext.equals("Больше") || answerNext.equals("Меньше") ){
            while (answerNext != "Верно"){
                System.out.println("Загаданное число - " + num + " ? (Верно/Меньше/Больше)");
                answerNext = scanner.nextLine();
                if (answerNext.equals("Больше")){
                lowLim = num;
                num = whatsNumber(lowLim, highLim);
            }
                else {
                highLim = num;
                num = whatsNumber(lowLim, highLim);
            }
        }}
        else {
            System.out.println("Загаданное число" + num + ". Определено за 1 попытку");
        }
    }
    public static int whatsNumber(int low, int high){
        int number = ((high-low)/2)+low;
        return number;
    }
}