package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        // Ask the user for the number of dice to roll
        System.out.print("Enter the number of dice to roll : ");
        numOfDice = input.nextInt();

        System.out.println();

        // Check whether the number of dice is valid
        if (numOfDice > 0) {

            // Roll the dice the requested number of times
            for (int i = 0; i < numOfDice; i++) {

                // Generate a random number between 1 and 6
                int roll = random.nextInt(1, 7);

                // Display the corresponding dice face
                printDie(roll);

                System.out.println("You rolled : " + roll);
                System.out.println();

                // Add the current roll to the total
                total += roll;
            }

            // Display the final result
            System.out.println("================================");
            System.out.println("        ROLL SUMMARY");
            System.out.println("================================");
            System.out.println("Number of Dice : " + numOfDice);
            System.out.println("Total of Rolls : " + total);
            System.out.println("================================");

        } else {

            // Display an error for invalid input
            System.out.println("[ERROR] Number of dice must be greater than zero.");
        }

        input.close();
    }

    // Displays the appropriate dice face according to the roll value
    static void printDie(int roll) {

        String dice1 = """
                 ----------
                |          |
                |    ⬤    |
                |          |
                 ----------                
                """ ;

        String dice2 = """
                 -----------
                |  ⬤       |
                |           |
                |        ⬤ |
                 -----------                
                """ ;

        String dice3 = """
                 -----------
                |  ⬤       |
                |     ⬤    |
                |       ⬤  |
                 -----------                
                """ ;

        String dice4 = """
                 -----------
                | ⬤     ⬤ |
                |           |
                | ⬤     ⬤ |
                 -----------                
                """ ;

        String dice5 = """
                 ------------
                | ⬤      ⬤ |
                |     ⬤     |
                | ⬤      ⬤ |
                 ------------                
                """ ;

        String dice6 = """
                 -----------
                | ⬤     ⬤ |
                | ⬤     ⬤ |
                | ⬤     ⬤ |
                 -----------                  
                """ ;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}
