package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String playerChoice;
        String computerChoice;
        String playAgain;

        // Game loop
        do {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       ROCK PAPER SCISSORS GAME");
            System.out.println("========================================");

            // Keep asking until a valid move is entered
            do {

                System.out.print("\nEnter your move (Rock, Paper, Scissors): ");
                playerChoice = input.nextLine().toLowerCase();

                if (!playerChoice.equals("rock")
                        && !playerChoice.equals("paper")
                        && !playerChoice.equals("scissors")) {

                    System.out.println("\n[Error] Invalid Choice!");
                    System.out.println("Please choose Rock, Paper, or Scissors.");

                }

            } while (!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors"));

            // Generate computer's random choice
            computerChoice = choices[random.nextInt(3)];

            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println("           GAME RESULT");
            System.out.println("----------------------------------------");
            System.out.println("Your Choice    : " + playerChoice);
            System.out.println("Computer Choice: " + computerChoice);
            System.out.println("----------------------------------------");

            // Check for a tie
            if (playerChoice.equals(computerChoice)) {

                System.out.println("Result         : It's a tie!");

            }

            // Check if player wins
            else if (playerChoice.equals("rock")
                    && computerChoice.equals("scissors")
                    || playerChoice.equals("paper")
                    && computerChoice.equals("rock")
                    || playerChoice.equals("scissors")
                    && computerChoice.equals("paper")) {

                System.out.println("Result         : You Win!");

            }

            // Otherwise, computer wins
            else {

                System.out.println("Result         : You Lose!");
            }

            System.out.println("----------------------------------------");

            // Keep asking until user enters yes or no
            do {

                System.out.print("\nPlay again (Yes/No): ");
                playAgain = input.nextLine().toLowerCase();

                if (!playAgain.equals("yes")
                        && !playAgain.equals("no")) {

                    System.out.println(
                            "[Error] Please enter only Yes or No."
                    );
                }

            } while (!playAgain.equals("yes")
                    && !playAgain.equals("no"));

        } while (playAgain.equals("yes"));

        // Exit message
        System.out.println();
        System.out.println("========================================");
        System.out.println("       Thanks for playing! 😎");
        System.out.println("========================================");

        input.close();
    }
}