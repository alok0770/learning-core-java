package guessnumbergame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {

        // Creating Random and Scanner objects
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int randomNum;
        int chance = 3;

        // Generating a random number between 1 and 10
        randomNum = random.nextInt(1, 11);

        System.out.println("====================================");
        System.out.println("         GUESS THE NUMBER           ");
        System.out.println("====================================");

        // Continue the game until all attempts are used
        while (chance > 0) {

            System.out.println();
            System.out.println("Guess a Number Between 1 and 10");
            System.out.println();

            System.out.print("Enter Your Guess : ");
            guess = input.nextInt();

            // Check if the guess is lower than the random number
            if (guess < randomNum) {

                chance--;
                System.out.println();
                System.out.println("Too Low! " + chance + " Attempts Remaining.");

                if (chance == 0) {
                    System.out.println("You Lost!");
                    System.out.println("The Correct Number Was: " + randomNum);
                }
            }

            // Check if the guess is higher than the random number
            else if (guess > randomNum) {

                chance--;
                System.out.println();
                System.out.println("Too High! " + chance + " Attempts Remaining.");

                if (chance == 0) {
                    System.out.println("You Lost!");
                    System.out.println("The Correct Number Was: " + randomNum);
                }
            }

            // User guessed the correct number
            else {

                System.out.println("Congratulations! 🥳 You guessed the correct number!");
                System.out.println("Attempts Left: " + chance);
                break;
            }
        }

        // Closing the Scanner object
        input.close();
    }
}