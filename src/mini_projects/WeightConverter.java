package mini_projects;

import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        double weight;
        double newWeight;

        System.out.println("================================");
        System.out.println("       WEIGHT CONVERTER");
        System.out.println("================================");
        System.out.println();
        System.out.println("Choose a Conversion Option:");
        System.out.println("1. Kilograms (kg) → Pounds (lbs)");
        System.out.println("2. Pounds (lbs) → Kilograms (kg)");
        System.out.println();

        while (true) {

            System.out.print("Enter Your Choice : ");
            choice = input.nextInt();

            // Convert kilograms to pounds
            if (choice == 1) {

                System.out.println("\nYou Chose Option 1 😇\n");

                System.out.print("Enter Your Weight (kg) : ");
                weight = input.nextDouble();

                newWeight = weight * 2.20462;

                System.out.println("-------------------------------------");
                System.out.printf("Your Weight in Pounds : %.2f lbs%n", newWeight);
                System.out.println("-------------------------------------");

                break;

                // Convert pounds to kilograms
            } else if (choice == 2) {

                System.out.println("\nYou Chose Option 2 😇\n");

                System.out.print("Enter Your Weight (lbs) : ");
                weight = input.nextDouble();

                newWeight = weight / 2.20462;

                System.out.println("-------------------------------------");
                System.out.printf("Your Weight in Kilograms : %.2f kg%n", newWeight);
                System.out.println("-------------------------------------");

                break;

                // Invalid menu option
            } else {

                System.out.println("\n[Error] Invalid Choice! Please enter 1 or 2.\n");

            }
        }

        // Close the Scanner object
        input.close();
    }
}