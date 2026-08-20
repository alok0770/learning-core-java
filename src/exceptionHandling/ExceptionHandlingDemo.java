package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 0;
        int result;

        // ==========================================
        // Division Program
        // ==========================================

        System.out.println("================================");
        System.out.println("           DIVISION");
        System.out.println("================================");

        // ------------------------------------------
        // Taking input from the user
        // ------------------------------------------

        try {

            System.out.print("Enter first number  : ");
            firstNum = input.nextInt();

            System.out.print("Enter second number : ");
            secondNum = input.nextInt();

        }

        // Handle invalid input
        catch (InputMismatchException e) {

            System.out.println("--------------------------------");
            System.out.println("Error : Please enter valid numbers.");

        }

        // ------------------------------------------
        // Performing division
        // ------------------------------------------

        try {

            result = firstNum / secondNum;

            System.out.println("--------------------------------");
            System.out.println("Result : " + result);

        }

        // Handle division by zero
        catch (ArithmeticException e) {

            System.out.println("--------------------------------");
            System.out.println("Error : Cannot divide by zero.");

        }

        // ------------------------------------------
        // General Exception Handler
        // ------------------------------------------

        catch (Exception e) {

            System.out.println("--------------------------------");
            System.out.println("Error : Something went wrong.");

        }

        System.out.println("================================");

        // Close Scanner
        input.close();
    }
}