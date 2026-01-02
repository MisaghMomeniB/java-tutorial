// Package name
package Constructor;

// Person class demonstrates constructor overloading
class Person {

    // Variable to store person's name
    String name;

    // Variable to store person's age
    int age;

    // Default constructor
    // Initializes name as "Unknown" and age as 0
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    // Initializes name and age with given values
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to print person's information
    void printInfo() {
        System.out.println(name + " - " + age);
    }
}

// Main class
public class Main {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Person object using default constructor
        Person p1 = new Person();
        p1.printInfo();

        // Create Person object using parameterized constructor
        Person p2 = new Person("Ali", 25);
        p2.printInfo();
    }
}
