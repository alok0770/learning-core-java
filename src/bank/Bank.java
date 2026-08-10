package bank;

import java.util.Scanner;

public class Bank {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {

            // Display bank application header
            System.out.println("\n======================================");
            System.out.println("           BANK APPLICATION           ");
            System.out.println("======================================");

            // Display the main menu
            System.out.println("\n               MENU");
            System.out.println("--------------------------------------");
            System.out.println("1 -> Show Balance");
            System.out.println("2 -> Deposit");
            System.out.println("3 -> Withdraw");
            System.out.println("4 -> Exit");
            System.out.println("--------------------------------------");

            // Get user's choice
            System.out.print("Enter Your Choice : ");
            choice = input.nextInt();

            System.out.println();

            // Perform operation according to user's choice
            switch (choice) {

                case 1 -> {
                    System.out.println("-> Balance Selected");
                    System.out.println("--------------------------------------");
                    showBalance(balance);
                }

                case 2 -> {
                    System.out.println("-> Deposit Selected");
                    System.out.println("--------------------------------------");
                    balance = balance + deposit();
                }

                case 3 -> {
                    System.out.println("-> Withdraw Selected");
                    System.out.println("--------------------------------------");
                    balance = balance - withdraw(balance);
                }

                case 4 -> {
                    System.out.println("Thank You for using our Bank Application!");
                    isRunning = false;
                }

                default -> {
                    System.out.println("[ERROR] Invalid Choice!");
                    System.out.println("Please enter a number between 1 and 4.");
                }
            }

            System.out.println("--------------------------------------");
        }

        input.close();
    }

    // Displays the current account balance
    static void showBalance(double checkBalance) {
        System.out.printf("Your Current Balance : ₹%.2f%n", checkBalance);
    }

    // Takes a deposit amount and returns the valid amount
    static double deposit() {

        double amount;

        System.out.print("Enter Amount to Deposit : ₹");
        amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("[ERROR] Amount must be greater than zero.");
            return 0;
        } else {
            System.out.printf("₹%.2f deposited successfully.%n", amount);
            return amount;
        }
    }

    // Takes a withdrawal amount and checks whether it is valid
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter Amount to Withdraw : ₹");
        amount = input.nextDouble();

        // Check for zero or negative withdrawal amount
        if (amount <= 0) {
            System.out.println("[ERROR] Amount must be greater than zero.");
            return 0;
        }

        // Check whether sufficient balance is available
        else if (amount > balance) {
            System.out.println("[ERROR] Insufficient Balance!");
            return 0;
        }

        // Withdraw the valid amount
        else {
            System.out.printf("₹%.2f withdrawn successfully.%n", amount);
            return amount;
        }
    }
}