class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student studentone = new Student();
        studentone.name = "Misagh Momeni Bashusqeh";
        studentone.age = 20;
        System.out.println("Student Name: " + studentone.name);
        System.out.println("Student Age: " + studentone.age);
    }
}