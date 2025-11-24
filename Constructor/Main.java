package Constructor;

class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void printInfo() {
        System.out.println(name + " - " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printInfo();

        Person p2 = new Person("Ali", 25);
        p2.printInfo();
    }
}
