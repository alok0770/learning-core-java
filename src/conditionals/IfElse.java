package conditionals;

import java.util.Scanner;

public class IfElse {

    // If statement executes a block of code when the condition is true.
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("   Enter Your Details    ");
        System.out.println("=========================");
        System.out.println();

        // User information
        int age;
        String name;
        boolean isStudent;

        // Taking user input
        System.out.print("Enter Your Name : ");
        name = input.nextLine();

        System.out.print("Enter Your Age : ");
        age = input.nextInt();

        System.out.print("Are You a Student (true/false) : ");
        isStudent = input.nextBoolean();

        // Checking whether the user entered a name
        if (name.isEmpty()) {
            System.out.println("\n* You haven't entered your name!");
        } else {
            System.out.println("\nHello, " + name + "!");
        }

        // Checking the user's age category
        if (age > 65) {
            System.out.println("You are a senior citizen!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a minor!");
        }

        // Checking student status
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student.");
        }
        
        input.close();
    }
}