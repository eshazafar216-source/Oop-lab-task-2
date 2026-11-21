// Lab Task 2: University System Using OOP Principles

class Person {
    String name;
    int age;

    static String universityName = "National University";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void showUniversityInfo() {
        System.out.println("University: " + universityName);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    // Constructor 1
    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    // Constructor 2: overloaded constructor with different information.
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        this.salary = 0;
    }

    @Override
    void displayInfo() {
        System.out.println("\n--- Teacher Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {
    int rollNo;
    double marks;

    // Constructor 1
    Student(String name, int age, int rollNo, double marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Constructor 2: overloaded constructor with different information.
    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = 0;
    }

    @Override
    void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Person.showUniversityInfo();

        Teacher teacher1 = new Teacher("Mr. Ali", 40, "Computer Science", 80000);
        Teacher teacher2 = new Teacher("Ms. Sara", 35, "Mathematics");

        Student student1 = new Student("Ayesha", 19, 101, 88.5);
        Student student2 = new Student("Ahmed", 20, 102);

        teacher1.displayInfo();
        teacher2.displayInfo();

        student1.displayInfo();
        student2.displayInfo();
    }
}
