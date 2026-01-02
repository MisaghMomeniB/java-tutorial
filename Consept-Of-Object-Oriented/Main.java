// Student class represents a student with a name and age
class Student {

    // Variable to store the student's name
    String name;

    // Variable to store the student's age
    int age;
}

// Main class
public class Main {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create an object of the Student class
        Student studentone = new Student();

        // Assign name to the student
        studentone.name = "Misagh Momeni Bashusqeh";

        // Assign age to the student
        studentone.age = 20;

        // Print student name
        System.out.println("Student Name: " + studentone.name);

        // Print student age
        System.out.println("Student Age: " + studentone.age);
    }
}
