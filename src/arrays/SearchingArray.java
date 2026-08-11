package arrays;
import java.util.Scanner;

public class SearchingArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array containing numbers to search
        int[] numbers = {
                1, 5, 8, 3, 22,
                34, 12, 9, 10, 56
        };

        System.out.println("================================");
        System.out.println("         ARRAY SEARCH");
        System.out.println("================================");
        System.out.println("Array contains 10 elements.");
        System.out.println("Valid indexes: 0 to 9");
        System.out.println();

        // Ask the user for the number to search
        System.out.print("Enter target number: ");
        int target = input.nextInt();

        // Initially, assume that the target is not found
        boolean found = false;

        // Search for the target number using Linear Search
        for (int i = 0; i < numbers.length; i++) {

            // Compare the target with the current array element
            if (target == numbers[i]) {

                System.out.println("\n--------------------------------");
                System.out.println(
                        target + " -> Found at index: " + i
                );
                System.out.println("--------------------------------");

                // Target found, so update the flag
                found = true;

                // No need to search further
                break;
            }
        }

        // If target was not found after checking the entire array
        if (!found) {
            System.out.println("\n--------------------------------");
            System.out.println(
                    target + " -> Not found in the array."
            );
            System.out.println("--------------------------------");
        }

        input.close();
    }
}