package mini_projects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int balance = 500;
        int bet;
        int payout;
        String[] row;

        System.out.println("========================================");
        System.out.println("          🎰 WELCOME TO SLOT GAME 🎰");
        System.out.println("            🍒 🍉 🍋 🔔 ⭐️");
        System.out.println("========================================");

        // Continue the game while the player has money
        while (balance > 0) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("           CURRENT BALANCE");
            System.out.println("========================================");
            System.out.println("Balance : ₹" + balance);
            System.out.println("----------------------------------------");

            // Take bet amount from the player
            System.out.print("Enter your bet amount : ₹");
            bet = input.nextInt();

            // Check if the bet is greater than the balance
            if (bet > balance) {

                System.out.println();
                System.out.println("[ERROR] Insufficient balance.");
                continue;
            }

            // Check if the bet is zero or negative
            else if (bet <= 0) {

                System.out.println();
                System.out.println("[ERROR] Bet must be greater than zero.");
                continue;
            }

            // Deduct the bet from the balance
            else {

                balance -= bet;
            }

            // Spin the slot machine
            System.out.println();
            System.out.println("              SPINNING...");
            System.out.println("----------------------------------------");

            row = spinRow();

            // Display the generated symbols
            printRow(row);

            // Calculate the payout
            payout = getPayout(row, bet);

            System.out.println("----------------------------------------");

            // Check if the player won
            if (payout > 0) {

                balance += payout;

                System.out.println("🎉 CONGRATULATIONS! YOU WON! 🎉");
                System.out.println();
                System.out.println("Bet Amount   : ₹" + bet);
                System.out.println("Amount Won   : ₹" + (payout - bet));
                System.out.println("Total Payout : ₹" + payout);
                System.out.println("New Balance  : ₹" + balance);

            } else {

                System.out.println("😢 SORRY! YOU LOST!");
                System.out.println();
                System.out.println("Bet Amount   : ₹" + bet);
                System.out.println("Amount Won   : ₹0");
                System.out.println("Lost Amount  : ₹" + bet);
                System.out.println("New Balance  : ₹" + balance);
            }

            System.out.println("========================================");
        }

        // Game-over message
        System.out.println();
        System.out.println("========================================");
        System.out.println("              GAME OVER");
        System.out.println("========================================");
        System.out.println("Your balance has reached ₹0.");
        System.out.println("Thanks for playing! 🎰");
        System.out.println("========================================");

        input.close();
    }

    // Generates three random symbols for the slot machine
    static String[] spinRow() {

        String[] symbols = {
                "🍒",
                "🍉",
                "🍋",
                "🔔",
                "⭐️"
        };

        String[] row = new String[3];

        Random random = new Random();

        // Generate three random symbols
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Displays the three slot machine symbols
    static void printRow(String[] row) {

        System.out.println("              " + String.join(" | ", row));
    }

    // Calculates the payout based on matching symbols
    static int getPayout(String[] row, int bet) {

        // Three matching symbols
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            return switch (row[0]) {

                case "🍒" -> bet * 30;
                case "🍉" -> bet * 40;
                case "🍋" -> bet * 50;
                case "🔔" -> bet * 100;
                case "⭐️" -> bet * 200;

                default -> 0;
            };
        }

        // First and second symbols match
        else if (row[0].equals(row[1])) {

            return switch (row[0]) {

                case "🍒" -> bet * 20;
                case "🍉" -> bet * 25;
                case "🍋" -> bet * 30;
                case "🔔" -> bet * 40;
                case "⭐️" -> bet * 80;

                default -> 0;
            };
        }

        // Second and third symbols match
        else if (row[1].equals(row[2])) {

            return switch (row[1]) {

                case "🍒" -> bet * 20;
                case "🍉" -> bet * 25;
                case "🍋" -> bet * 30;
                case "🔔" -> bet * 40;
                case "⭐️" -> bet * 80;

                default -> 0;
            };
        }

        // No matching symbols
        return 0;
    }
}