package src.main.java.Core.OOP_et_packages.task249;

public class JavaStudent extends Student {

    public JavaStudent() {
        super();
        super.studying = "Прохожу курс по Java";
    }

    public static void main(String[] args) {
        JavaStudent studentJ = new JavaStudent();
        studentJ.study();
    }

}
