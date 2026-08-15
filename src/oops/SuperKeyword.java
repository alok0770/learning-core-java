package oops;

public class SuperKeyword {

    public static void main(String[] args) {

        // Creating Person object
        Person person = new Person("Tom", "Holland");

        System.out.println("========================================");
        System.out.println("            PERSON DETAILS");
        System.out.println("========================================");
        person.showName();


        // Creating Student object
        Students students = new Students("Harry", "Potter", 7.0);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("            STUDENT DETAILS");
        System.out.println("----------------------------------------");
        students.showStudentDetails();


        // Creating Employee object
        Employee employee = new Employee("Alok", "Rana", 120000);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("           EMPLOYEE DETAILS");
        System.out.println("----------------------------------------");
        employee.showEmployee();

        System.out.println("========================================");
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
                "Name : " + this.firstName + " " + this.lastName
        );
    }
}


// Student inherits Person
class Students extends Person {

    double gpa;


    // Student constructor
    Students(String firstName, String lastName, double gpa) {

        // Calling parent class constructor using super()
        super(firstName, lastName);

        this.gpa = gpa;
    }


    // Display student details
    void showStudentDetails() {

        // Accessing parent class variables using super
        System.out.println(
                "Name : " + super.firstName + " "
                        + super.lastName
        );

        System.out.println(
                "GPA  : " + this.gpa
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
                "Name   : " + super.firstName + " "
                        + super.lastName
        );

        System.out.println(
                "Salary : ₹" + this.salary
        );
    }
}