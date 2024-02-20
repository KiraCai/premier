package src.main.java.Core.Введение_в_Java;

public class TaskStepik1 {
    public static void main(String[] args){
        String text1 = "Madam, I'm Adam!";
        System.out.println(isPalindrome(text1));
    }
    //использование регулярных выражений
    public static boolean isPalindrome(String text) {
        String regex = "[^a-zA-Z0-9]";
        String text1 = text.replaceAll(regex, "");
        String text2 = text1.toLowerCase();
        StringBuffer buffer = new StringBuffer(text2);
        //String reverseText = buffer.reverse().toString();
        return text2.equals(buffer.reverse().toString());
    }
}
