package src.main.java.Core.Введение_в_Java.task1611;

import java.util.regex.*;
/**
 * Цель: Работа с регулярными выражениями
 * Что нужно знать:
 * 1. Классы String, Pattern, Matcher
 * 2. Регулярные выражения
 * Задание:
 * Реализовать метод, который будет принимать целочисленное строку, и отвечать соответствует ли эта строка почтовому
 * ящику сервисов google (gmail.com) или майкрософт (outlook.com). Будет считать, что в корректном почтовом ящике можно
 * использовать только цифры и буквы.
 * Пример ввода: "kata12@gmail.com"
 * Пример вывода: true
 * Пример ввода: "@outlook.com"
 * Пример вывода: false
 * Требования:
 * метод должен быть public static
 * сигнатура метода isGmailOrOutlook(String email)
 * метод возвращает boolean
 */
public class Task1611 {
    public static void main(String[] args){
        String mail = "kata13@gmail.com";
        System.out.println(isGmailOrOutlook(mail));
    }
    public static boolean isGmailOrOutlook(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@gmail.com|@outlook.com$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        return matchFound;
    }
}
