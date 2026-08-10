package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] foods;
        int size;

        // Ask the user for the number of food items
        System.out.print("How many foods do you want to enter? ");
        size = input.nextInt();

        // Consume the leftover newline
        // before using nextLine()
        input.nextLine();

        // Create an array with the user-defined size
        foods = new String[size];

        // Take food names from the user
        // and store them in the array
        for (int i = 0; i < foods.length; i++) {

            System.out.print("Enter food " + (i + 1) + " : ");
            foods[i] = input.nextLine();
        }

        // Display the complete array
        System.out.println("\n================================");
        System.out.println("          FOOD LIST");
        System.out.println("================================");
        System.out.println(Arrays.toString(foods));
        System.out.println("================================");

        input.close();
    }
}