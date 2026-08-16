package oops;

import java.util.Scanner;

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Parent class reference
        Animals animals;

        boolean isRunning = true;


        // Program header
        System.out.println("========================================");
        System.out.println("        RUNTIME POLYMORPHISM");
        System.out.println("========================================");

        System.out.println("1. Dog Sound");
        System.out.println("2. Cat Sound");
        System.out.println("0. Exit");

        System.out.println("----------------------------------------");


        // Continue the program until the user chooses 0
        while (isRunning) {

            System.out.print("Enter your choice (0-2): ");
            int choice = scanner.nextInt();


            if (choice == 1) {

                // Parent reference refers to a Dogs object
                animals = new Dogs();

                // Dogs class's overridden sound() method is called
                animals.sound();

            }

            else if (choice == 2) {

                // Parent reference refers to a Cats object
                animals = new Cats();

                // Cats class's overridden sound() method is called
                animals.sound();

            }

            else if (choice == 0) {

                isRunning = false;

                System.out.println();
                System.out.println("Exiting the program...");
                System.out.println("Thank you for using the program!");

            }

            else {

                // Handle invalid choices
                System.out.println("Invalid choice! Please enter 0, 1, or 2.");
                System.out.println();
            }
        }


        // Close Scanner
        scanner.close();

        System.out.println("========================================");
    }
}


// Abstract parent class
abstract class Animals {

    // Abstract method
    abstract void sound();
}


// Dogs inherits Animals
class Dogs extends Animals {

    // Overriding the parent class's sound() method
    @Override
    void sound() {

        System.out.println("The dog barks.");
        System.out.println();
    }
}


// Cats inherits Animals
class Cats extends Animals {

    // Overriding the parent class's sound() method
    @Override
    void sound() {

        System.out.println("The cat says meow.");
        System.out.println();
    }
}