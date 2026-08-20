package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Ask the user how many names they want to enter
        System.out.print("Enter how many names you want to enter: ");
        int numOfNames = input.nextInt();

        // Consume the leftover newline character
        input.nextLine();

        // Take names from the user and add them to the ArrayList
        for (int i = 1; i <= numOfNames; i++) {

            System.out.print("Enter name " + i + ": ");
            String name = input.nextLine().toUpperCase();

            names.add(name);
        }

        // Display the final ArrayList
        System.out.println();
        System.out.println("========== NAMES ARRAYLIST ==========");
        System.out.println("Names : " + names);
        System.out.println("Total Names : " + names.size());
        System.out.println("=====================================");

        // Close the Scanner
        input.close();
    }
}