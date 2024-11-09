package src.main.java.Core.OOP_et_packages.task249;

public class JavaStudent extends Student {
    String studying = "Прохожу курс по Java";
    public JavaStudent(){
        //super();
        //this.studying = "Прохожу курс по Java";
        //this.studying = studying;
        //this.study();
    }

    /*public void study() {
        System.out.println("Я очень занят. " + studying);
    }*/
    public static void main(String[] args) {

        JavaStudent s = new JavaStudent();
        //s.studying = "Прохожу курс по Java";
        System.out.println(s.studying);
        s.study();
        return;
    }
}
