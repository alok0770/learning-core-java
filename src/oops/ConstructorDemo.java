package oops;

public class ConstructorDemo {

    public static void main(String[] args) {

        // Creating Student objects using the parameterized constructor
        Student student = new Student(
                "Alok", 21, "B.C.A", 8266060510L, 5.4
        );

        Student student1 = new Student(
                "Aman", 20, "B.tech", 56472192L, 3.2
        );

        Student student2 = new Student(
                "Shivaya", 25, "B.tech", 74625846L, 5.7
        );

        // Displaying details of first student
        System.out.println("================================");
        System.out.println("        STUDENT DETAILS");
        System.out.println("================================");
        System.out.println("Name   : " + student.name);
        System.out.println("Age    : " + student.age);
        System.out.println("Course : " + student.course);
        System.out.println("Phone  : " + student.phoneNo);
        System.out.println("GPA    : " + student.gpa);

        // Displaying details of second student
        System.out.println("--------------------------------");
        System.out.println("Name   : " + student1.name);
        System.out.println("Age    : " + student1.age);
        System.out.println("Course : " + student1.course);
        System.out.println("Phone  : " + student1.phoneNo);
        System.out.println("GPA    : " + student1.gpa);

        // Displaying details of third student
        System.out.println("--------------------------------");
        System.out.println("Name   : " + student2.name);
        System.out.println("Age    : " + student2.age);
        System.out.println("Course : " + student2.course);
        System.out.println("Phone  : " + student2.phoneNo);
        System.out.println("GPA    : " + student2.gpa);

        System.out.println("================================");
    }
}


// Student class
class Student {

    // Instance variables
    String name;
    int age;
    String course;
    long phoneNo;
    double gpa;

    // Parameterized constructor
    Student(String name, int age, String course, long phoneNo, double gpa) {

        // 'this' refers to the current object
        this.name = name;
        this.age = age;
        this.course = course;
        this.phoneNo = phoneNo;
        this.gpa = gpa;
    }
}