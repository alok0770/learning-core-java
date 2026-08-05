package io;

import java.util.Scanner;

public class ScannerBasics {
    public static void main(String[] args) {

        // Creating a Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Taking the user's first name as input
        System.out.print("Enter Your First Name : ");
        String name = input.nextLine();

        // Taking the user's last name as input
        System.out.print("Enter Your Last Name : ");
        String lastname = input.next();

        // Taking the user's age as integer input
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();

        // Taking the user's GPA as double input
        System.out.print("Enter Your GPA : ");
        double gpa = input.nextDouble();

        // Taking a boolean input to check whether the user is a student
        System.out.print("Are you a student? (True/False) : ");
        boolean isStudent = input.nextBoolean();

        // Displaying the user's information
        System.out.println("Hello " + name + " " + lastname);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA : " + gpa);

        // Checking the student's status using if-else
        if (isStudent) {
            System.out.println("Now you are enrolled as a Student");
        } else {
            System.out.println("You Are Not Eligible");
        }

        // Closing the Scanner object to release system resources
        input.close();
    }
}

class CommonMistakes {
    public static void main(String[] args) {

        // Creating Scanner object to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Taking user's age as integer input
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        // Consuming the leftover newline character (\n)
        // left by nextInt() before using nextLine()
        input.nextLine();

        // Taking user's hobby as String input
        System.out.print("Enter Your Hobby : ");
        String hobby = input.nextLine();

        // Displaying the user's entered information
        System.out.println("Your age : " + age);
        System.out.println("Your hobby : " + hobby);

        // Closing the Scanner object
        input.close();
    }
}