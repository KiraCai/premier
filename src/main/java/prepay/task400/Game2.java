package src.main.java.prepay.task400;

import java.util.Scanner;
import java.util.Random;

/**
 * Реализовать игру, предлагающая игроку угадать загаданное ей число.
 * При запуске игры игроком вводится диапозон, в котором будет лежать загадываемое число.
 * Далее игра дает возможность игроку ввести число, после каждой попытки сообщая, загаданное больше или меньше введенного.
 * Когда игра число угадает, она должна вывести в консоль за какое количество попыток число было угадано.
 * Пример вывода в консоль:
 Старт игры
 Введите нижний предел
 >0
 Введите верхний предел
 >100
 Число загадано
 Введите число
 >50
 Неверно. Загаданное число больше. Введите новое число
 >70
 Неверно. Загаданное число меньше. Введите новое число
 >60
 Верно. Загаданное число определено за 2 попытки
 Конец игры
 */
public class Game2 {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт игры");
        System.out.println("Введите нижний предел");
        int lowLim = scanner.nextInt();
        System.out.println("Введите верхний предел");
        int highLim = scanner.nextInt();
        System.out.println("Число загадано");
        //две строки ниже из интернета, но я прочитала обоснование и поняла
        highLim -= lowLim;
        int i = ((int) (Math.random() * ++highLim)) + lowLim;
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num != i) {
            while (num != i) {
                count ++;
                if (num<i) {
                    System.out.println("Неверно. Загаданное число больше. Введите новое число");
                    num = scanner.nextInt();
                }
                else {
                    System.out.println("Неверно. Загаданное число меньше. Введите новое число");
                    num = scanner.nextInt();
                }
            }
            System.out.println("Верно. Загаданное число определено за " + count + " попытки");
        }
        else {
            System.out.println("Верно. Загаданное число определено за 1 попыткy");
        }
    }
}