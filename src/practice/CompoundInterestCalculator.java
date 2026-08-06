package practice;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {

        // Formula:
        // A = P × (1 + r/n)^(n×t)

        Scanner input = new Scanner(System.in);

        // Creating variables
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("====================================");
        System.out.println("    COMPOUND INTEREST CALCULATOR    ");
        System.out.println("====================================");
        System.out.println();

        // Taking the principal amount
        System.out.print("Enter the Principal Amount : ");
        principal = input.nextDouble();

        // Validate the principal amount
        while (principal < 1000) {
            System.out.println("Invalid! The Principal Amount must be at least ₹1000.");
            System.out.print("Enter the Principal Amount : ");
            principal = input.nextDouble();
        }

        // Taking the annual interest rate
        System.out.print("Enter the Annual Interest Rate (in %) : ");
        rate = input.nextDouble() / 100;

        // Validate the interest rate
        while (rate <= 0) {
            System.out.println("Invalid! The Interest Rate must be greater than 0.");
            System.out.print("Enter the Annual Interest Rate (in %) : ");
            rate = input.nextDouble() / 100;
        }

        // Taking the compounding frequency
        System.out.print("Enter the Number of Times Compounded Per Year : ");
        timesCompounded = input.nextInt();

        // Validate the compounding frequency
        while (timesCompounded <= 0) {
            System.out.println("Invalid! The Compounding Frequency must be greater than 0.");
            System.out.print("Enter the Number of Times Compounded Per Year : ");
            timesCompounded = input.nextInt();
        }

        // Taking the investment duration
        System.out.print("Enter the Investment Duration (Years) : ");
        years = input.nextInt();

        // Validate the investment duration
        while (years <= 0) {
            System.out.println("Invalid! The Investment Duration must be greater than 0.");
            System.out.print("Enter the Investment Duration (Years) : ");
            years = input.nextInt();
        }

        // Calculate the final amount
        amount = principal * Math.pow(
                1 + rate / timesCompounded,
                timesCompounded * years
        );

        // Display the final amount
        System.out.printf("%nFinal Amount : ₹%,.2f%n", amount);

        // Close the Scanner object
        input.close();
    }
}