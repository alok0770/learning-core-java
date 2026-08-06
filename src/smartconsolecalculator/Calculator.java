package smartconsolecalculator;

import java.util.Scanner;

public class Calculator {

    static final String LINE = "==========================="; // separator using for formatting

    // Validates and returns a valid integer input
    static int getValidInt(Scanner sc, String prompt) {
        System.out.print(prompt);

        while (!sc.hasNextInt()) { // loop until input is a valid integer
            System.out.println("[ERROR] Invalid Input - Please enter a numeric value only.");
            System.out.println();
            System.out.print(prompt);
            sc.next(); // discard invalid input22
        }

        return sc.nextInt();
    }

    // Validates a decimal input and ensures it's not zero
    static double getValidDivision(Scanner sc, String prompt) {
        System.out.print(prompt);

        while (!sc.hasNextDouble()) { // loop until input is a valid decimal
            System.out.println("[ERROR] Invalid Input - Please enter a numeric value only.");
            System.out.println();
            System.out.print(prompt);
            sc.next();
        }

        double number = sc.nextDouble();

        while (number == 0) { // reject zero, ask again
            System.out.println("[ERROR] Division by Zero is not allowed ");
            System.out.println();
            System.out.print(prompt);

            while (!sc.hasNextDouble()) { // re-validate type of new input
                System.out.println("[ERROR] Invalid Input - Please enter a numeric value only.");
                System.out.println();
                System.out.print(prompt);
                sc.next();
            }

            number = sc.nextDouble();
        }

        return number;
    }


    // Validates a decimal input without checking for zero
    static double getValidDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("[ERROR] Invalid Input - Please enter a numeric value only.");
            System.out.print(prompt);
            sc.next();
        }
        return sc.nextDouble();
    }

    // Adds two numbers and prints the result
    static void addition(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println();
        System.out.println(LINE);
        System.out.println(" * Result = " + result);
        System.out.println(LINE);
    }

    // Subtracts two numbers and prints the result
    static void subtraction(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println();
        System.out.println(LINE);
        System.out.println("* Result :- " + result);
        System.out.println(LINE);
    }

    // Multiplies two numbers and prints the result
    static void multiplication(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println();
        System.out.println(LINE);
        System.out.println("* Result :- " + result);
        System.out.println(LINE);
    }

    // Divides two numbers and prints result formatted to 2 decimal places
    static void division(double firstNum, double secondNum) {
        double result = firstNum / secondNum;
        System.out.println(LINE);
        System.out.print("* Result :- " + result); // %.2f limits output to 2 decimals
        System.out.println();
        System.out.println(LINE);
    }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            boolean isRunning = true;
            while (isRunning) {
                // Print the main menu
                System.out.println();
                System.out.println(" SMART CONSOLE CALCULATOR  ");
                System.out.println(LINE);


                System.out.println(" 1. Addition ");
                System.out.println(" 2. Subtraction ");
                System.out.println(" 3. Multiplication ");
                System.out.println(" 4. Division ");
                System.out.println(" 5. Exit ");
                System.out.println(LINE);
                System.out.println();

                // Using Scanner for user input

                int choice = getValidInt(sc, "* User :- Please Enter Your Choice : "); // get validated menu choice

                System.out.println();
                System.out.println(" :- Your Choice " + choice);
                System.out.println(LINE);
                System.out.println();

                // Using Switch for Multiple Choices and coditions
                switch (choice) {
                    case 1: {
                        System.out.println(" * Addition Selected ");
                        System.out.println(LINE);
                        System.out.println();

                        int firstNum = getValidInt(sc, "* Enter First Number : ");
                        int secondNum = getValidInt(sc, "* Enter Second Number : ");

                        addition(firstNum, secondNum);
                        break;
                    }
                    case 2: {
                        System.out.println(" * Subtraction Selected ");
                        System.out.println(LINE);
                        System.out.println();

                        int firstNum = getValidInt(sc, " Enter First Number : ");
                        int secondNum = getValidInt(sc, " Enter Second Number : ");

                        subtraction(firstNum, secondNum);
                        break;
                    }
                    case 3: {
                        System.out.println(" * Multiplication Selected ");
                        System.out.println(LINE);
                        System.out.println();

                        int firstNum = getValidInt(sc, " Enter First Number : ");
                        int secondNum = getValidInt(sc, " Enter Second Number : ");

                        multiplication(firstNum, secondNum);
                        break;
                    }
                    case 4: {
                        System.out.println(" * division Selected ");
                        System.out.println(LINE);
                        System.out.println();

                        double firstNum = getValidDouble(sc, " Enter First Number : ");
                        double secondNum = getValidDivision(sc, " Enter Second Number : ");

                        division(firstNum, secondNum);
                        break;

                    }
                    case 5: {
                        isRunning = false;
                        System.out.println("Thank You 😇For Using Smart Console Calculator");
                        break;
                    }

                    default: {
                        System.out.println("Invalid Choice");
                    }
                }
            }
        }
    }

