package src.main.java.Core.Introduction_to_Java.task1612;

/**
 * Вам дан список ролей и сценарий пьесы в виде массива строчек. Каждая строчка сценария пьесы дана в следующем виде:
 * Роль: текст
 * Текст может содержать любые символы.
 * Задание:
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример).
 * Каждая группа распечатывается в следующем виде:
 * Роль:
 * i) текст
 * j) текст2
 * ...
 * ==перевод строки==
 * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей.
 * Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
 * Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно,
 * неправильная сборка результирующей строчки может выйти за ограничение по времени.
 * Обратите внимание еще на несколько нюансов:
 * имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
 * название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
 * роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
 * в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
 * будьте внимательны, не добавляйте лишних пробелов в конце строк.
 * Пример ввода 1:
 * roles:
 * Городничий
 * Аммос Федорович
 * Артемий Филиппович
 * Лука Лукич
 * textLines:
 * Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * Аммос Федорович: Как ревизор?
 * Артемий Филиппович: Как ревизор?
 * Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * Аммос Федорович: Вот те на!
 * Артемий Филиппович: Вот не было заботы, так подай!
 * Лука Лукич: Господи боже! еще и с секретным предписаньем!
 * Пример вывода 1:
 * Городничий:
 * 1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * 4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * Аммос Федорович:
 * 2) Как ревизор?
 * 5) Вот те на!
 * Артемий Филиппович:
 * 3) Как ревизор?
 * 6) Вот не было заботы, так подай!
 * Лука Лукич:
 * 7) Господи боже! еще и с секретным предписаньем!
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Метод должен принимать на вход два массива строк.
 * 3. Метод должен возвращать строку.
 * 4. Результативная строка должна соответствовать уcловию.
 * 5. Необходимо использовать StringBuilder
 */
public class Task1612 {
    public static void main(String[] args) {
        String[] role = new String[] {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};;
        String[] textLine = new String[] {"Городничий: Я пригласил вас, господа, с тем," +
                " чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(role, textLine));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sortedList = new StringBuilder();
        StringBuilder bilderRole = new StringBuilder();
        String bilderRoleString;
        String bildString;
        String builderTextLinesForSortString;
        String builderTextLinesString;
        for (int i = 0; i < roles.length; i++) {
            bilderRole.append(roles[i]);
            bilderRoleString = bilderRole.toString();
            sortedList.append(bilderRoleString);
            for (int j = 0; j <textLines.length; j++) {
                StringBuilder builderTextLines = new StringBuilder();
                builderTextLines.append(textLines[j]);
                builderTextLinesString = builderTextLines.toString();
                if (builderTextLinesString.contains(bilderRoleString)) {
                    builderTextLinesForSortString = builderTextLines.toString();
                    bildString = builderTextLinesForSortString.replace(bilderRoleString + ": ", "");
                    sortedList.append('\n');
                    sortedList.append(j + 1 + ") ");
                    sortedList.append(bildString);
                }
            }
            bilderRole.delete(0, bilderRole.length());
            sortedList.append('\n');
            sortedList.append('\n');
        }
        String rew = sortedList.toString();
        sortedList.delete(0, sortedList.length());
        return rew;
    }
}
