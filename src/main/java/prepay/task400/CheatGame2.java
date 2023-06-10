package src.main.java.prepay.task400;

import java.util.Scanner;

/**
 * Условие такое же как в Game2, но игра читерит - когда игрок угадал число,
 * она перезагадывает число (оно должно не выходить за рамки обьявленных ранне ограничений больше/меньше)
 * Если перезагадать возможности не осталось, то признает что число угадано
 */
public class CheatGame2 {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Старт игры");
        System.out.println("Введите нижний предел");
        int lowLim = 0; //scanner.nextInt();
        System.out.println("Введите верхний предел");
        int highLim = 10; //scanner.nextInt();
        System.out.println("Число загадано");
        int randomNumber = getNewNumber(lowLim, highLim);
        System.out.println(randomNumber);
        System.out.println("Введите число");
        int numberPerson = scanner.nextInt();
        if (numberPerson != randomNumber) {

        while (count < highLim-lowLim+1){
            count++;
            if (numberPerson < randomNumber) {
                System.out.println("Неверно. Загаданное число больше. Введите новое число");
            } else {
                System.out.println("Неверно. Загаданное число меньше. Введите новое число");
            }
            numberPerson = scanner.nextInt();
        }
        System.out.println("Верно. Загаданное число определено за " + count + " попытки");
    } else {
        System.out.println("Верно. Загаданное число определено за 1 попыткy");
    }}



        public static int getNewNumber(int low, int high) {
        int range = high - low;
        return (((int) (Math.random() * ++range)) + low);
    }
}