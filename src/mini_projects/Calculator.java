package mini_projects;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         SMART CALCULATOR");
        System.out.println("====================================");
        System.out.println();

        int choice;
        double firstNum;
        double secondNum;
        double result;

        boolean isRunning = true;

        // Runs the calculator until the user chooses to exit
        while (isRunning) {

            System.out.println("         CALCULATOR MENU");
            System.out.println("====================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.println();

            System.out.print("* Enter Your Choice : ");
            choice = input.nextInt();

            // Perform the selected operation
            switch (choice) {

                case 1 -> {

                    System.out.println("\n-> You Chose Addition\n");

                    System.out.print("Enter Your First Number : ");
                    firstNum = input.nextDouble();

                    System.out.print("Enter Your Second Number : ");
                    secondNum = input.nextDouble();

                    result = firstNum + secondNum;

                    System.out.println("\n--------------------------");
                    System.out.printf("Addition Result : %.2f%n", result);
                    System.out.println("--------------------------");
                }

                case 2 -> {

                    System.out.println("\n-> You Chose Subtraction\n");

                    System.out.print("Enter Your First Number : ");
                    firstNum = input.nextDouble();

                    System.out.print("Enter Your Second Number : ");
                    secondNum = input.nextDouble();

                    result = firstNum - secondNum;

                    System.out.println("\n--------------------------");
                    System.out.printf("Subtraction Result : %.2f%n", result);
                    System.out.println("--------------------------");
                }

                case 3 -> {

                    System.out.println("\n-> You Chose Multiplication\n");

                    System.out.print("Enter Your First Number : ");
                    firstNum = input.nextDouble();

                    System.out.print("Enter Your Second Number : ");
                    secondNum = input.nextDouble();

                    result = firstNum * secondNum;

                    System.out.println("\n--------------------------");
                    System.out.printf("Multiplication Result : %.2f%n", result);
                    System.out.println("--------------------------");
                }

                case 4 -> {

                    System.out.println("\n-> You Chose Division\n");

                    System.out.print("Enter Your First Number : ");
                    firstNum = input.nextDouble();

                    System.out.print("Enter Your Second Number : ");
                    secondNum = input.nextDouble();

                    if (secondNum == 0) {
                        System.out.println("\n[ERROR] :- Can't Diveded BY Zero \n");
                    } else {
                        result = firstNum / secondNum;

                        System.out.println("\n--------------------------");
                        System.out.printf("Division Result : %.2f%n", result);
                        System.out.println("--------------------------");
                    }
                }
                case 5 -> {

                    System.out.println("\n-> You Chose Modulus\n");

                    System.out.print("Enter Your First Number : ");
                    firstNum = input.nextDouble();

                    System.out.print("Enter Your Second Number : ");
                    secondNum = input.nextDouble();

                    result = firstNum % secondNum;

                    System.out.println("\n--------------------------");
                    System.out.printf("Modulus Result : %.2f%n", result);
                    System.out.println("--------------------------");
                }

                case 6 -> {

                    System.out.println("\nThank You For Using Smart Calculator 😇");
                    isRunning = false;
                }

                default -> System.out.println("\n[ERROR] Invalid Choice! Please Enter A Valid Option.\n");
            }
        }

        input.close();
    }
}