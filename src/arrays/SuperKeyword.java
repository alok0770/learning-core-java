package oops;

public class SuperKeyword {

    public static void main(String[] args) {

        // Creating Person object
        Person person = new Person("Tom", "Holland");
        person.showName();

        // Creating Student object
        Student student = new Student("Harry", "Potter", 7.0);
        student.showStudentDetails();

        // Creating Employee object
        Employee employee = new Employee("Alok", "Rana", 120000);
        employee.showEmployee();
    }
}


// Parent class
class Person {

    String firstName;
    String lastName;


    // Parent class constructor
    Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }


    // Method to display person's name
    void showName() {

        System.out.println(
                "Hello " + this.firstName + " " + this.lastName
        );
    }
}


// Student inherits Person
class Student extends Person {

    double gpa;


    // Student constructor
    Student(String firstName, String lastName, double gpa) {

        // Calling parent class constructor using super()
        super(firstName, lastName);

        this.gpa = gpa;
    }


    // Display student details
    void showStudentDetails() {

        // Accessing parent class variables using super
        System.out.println(
                "Hello " + super.firstName + " "
                        + super.lastName
                        + ", your GPA is " + this.gpa
        );
    }
}


// Employee inherits Person
class Employee extends Person {

    int salary;


    // Employee constructor
    Employee(String firstName, String lastName, int salary) {

        // Calling parent class constructor using super()
        super(firstName, lastName);

        this.salary = salary;
    }


    // Display employee details
    void showEmployee() {

        // Accessing parent class variables using super
        System.out.println(
                "Hello " + super.firstName + " "
                        + super.lastName
                        + ", your salary is ₹" + this.salary
        );
    }
}