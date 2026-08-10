package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean isRunning = true;


        while (isRunning) {

            int total = 0;

            System.out.println("\n================================");
            System.out.println("          DICE ROLLER");
            System.out.println("================================");

            System.out.print("Enter the number of dice (0 to exit) : ");
            int numOfDice = input.nextInt();

            // Exit condition
            if (numOfDice == 0) {
                System.out.println("\nThank you for using Dice Roller!");
                isRunning = false;
                continue;
            }

            // Reject negative numbers
            if (numOfDice < 0 || numOfDice > 10) {
                System.out.println("[ERROR] Enter a number between 1 and 10.");
                continue;
            }

            System.out.println();

            // Roll the dice
            for (int i = 0; i < numOfDice; i++) {

                int roll = random.nextInt(1, 7);

                printDie(roll);

                System.out.println("You rolled : " + roll);
                System.out.println();

                total += roll;
            }

            // Display roll summary
            System.out.println("================================");
            System.out.println("          ROLL SUMMARY");
            System.out.println("================================");
            System.out.println("Number of Dice : " + numOfDice);
            System.out.println("Total of Rolls : " + total);
            System.out.println("================================");
        }

        input.close();
    }

    // Displays the appropriate dice face
    // according to the generated roll.
    static void printDie(int roll) {

        String dice1 = """
                 ----------
                |          |
                |    ⬤    |
                |          |
                 ----------
                """;

        String dice2 = """
                 ----------
                |  ⬤      |
                |          |
                |       ⬤ |
                 ----------
                """;

        String dice3 = """
                 ----------
                |  ⬤       |
                |     ⬤    |
                |       ⬤  |
                 ----------
                """;

        String dice4 = """
                 ----------
                |  ⬤   ⬤  |
                |           |
                |  ⬤   ⬤  |
                 ----------
                """;

        String dice5 = """
                 ----------
                |  ⬤   ⬤  |
                |     ⬤    |
                |  ⬤   ⬤  |
                 ----------
                """;

        String dice6 = """
                 ----------
                |  ⬤   ⬤  |
                |  ⬤   ⬤  |
                |  ⬤   ⬤  |
                 ----------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("[ERROR] Invalid Roll.");
        }
    }
}