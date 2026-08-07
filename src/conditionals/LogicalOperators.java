package conditionals;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        // && Logical AND  -> Both conditions must be true
        // || Logical OR   -> At least one condition must be true
        // !  Logical NOT  -> Reverses a boolean value

        Scanner input = new Scanner(System.in);

        String username;
        boolean isRunning = true;

        // Keep asking until a valid username is entered
        while (isRunning) {

            System.out.print("\nEnter a New Username : ");
            username = input.nextLine();

            // Username length must be between 4 and 12 characters
            if (username.length() < 4 || username.length() > 12) {

                System.out.println("[ERROR] Username must be between 4 and 12 characters.");

            }
            // Username must not contain spaces or underscores
            else if (username.contains(" ") || username.contains("_")) {

                System.out.println("[ERROR] Username must not contain spaces or underscores.");

            }
            // Username is valid
            else {

                System.out.println("\nUsername Created Successfully!");
                System.out.println("Welcome, " + username + " 😇");

                isRunning = false;
            }
        }

        input.close();
    }
}