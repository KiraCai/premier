package src.main.java.Core.OOP_et_packages.task249;

public class Student {
    protected String studying;
    protected Student(String work) {
        this.studying = work;
    }
    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }
    public void study() {
        System.out.println("Я очень занят. " + studying);
    }
    /*public static void main(String[] args) {

        Student stuu = new Student("mnjhgf");
        System.out.println(stuu.studying);
        stuu.study();
        return;
    }*/
}
