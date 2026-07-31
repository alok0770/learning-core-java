package SmartConsoleCalculator;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // 1. Menu print
        String line = "===========================";
        System.out.println(line);
        System.out.println(" SMART CONSOLE CALCULATOR  ");
        System.out.println(line);

        System.out.println(" 1. Addition ");
        System.out.println(" 2. Subtraction ");
        System.out.println(" 3. Multiplication ");
        System.out.println(" 4. Division ");
        System.out.println(" 5. Exit ");
        System.out.println();

        // 2. Using Scanner For User Input
        Scanner sc = new Scanner(System.in);
        System.out.print(" * User :-  Please Enter Your Choice : ");
        int choice = sc.nextInt();
        System.out.println();
        System.out.println(" :- Your Choice " + choice);
        System.out.println(line);
        System.out.println();

        // 3. Using Switch

        switch (choice) {
            case 1: {

                System.out.println(" * Addition Selected");
                System.out.println();
                System.out.print(" Enter First Number : ");
                int firstNum = sc.nextInt();

                System.out.print(" Enter Second Number : ");
                int secondNum = sc.nextInt();

                int result = firstNum + secondNum;
                System.out.println();
                System.out.println(line);
                System.out.println("Addition Result :- " + result);
                System.out.println(line);

                break;
            }
            case 2: {
                System.out.println("Subtraction Selected");
                System.out.println();
                System.out.print(" Enter First Number : ");
                int firstNum = sc.nextInt();

                System.out.print(" Enter Second Number :  ");
                int secondNum = sc.nextInt();

                int result = firstNum - secondNum ;
                System.out.println();
                System.out.println(line);
                System.out.println(" Subtraction Result :- " + result);
                System.out.println(line);
                break;
            }

            case 3: {

                System.out.println("Multiplication Selected");
                System.out.println();
                System.out.print(" Enter First Number : ");
                int firstNum = sc.nextInt();

                System.out.print(" Enter Second Number : ");
                int secondNum = sc.nextInt();

                int result = firstNum * secondNum ;
                System.out.println();
                System.out.println(line);
                System.out.println(" Multiplication Result :- " + result);
                System.out.println(line);

                break;
            }

            case 4: {
                System.out.println("Division Selected");
                System.out.println();
                System.out.print(" Enter First Number : ");
                double firstNum = sc.nextInt();

                System.out.print("Enter Second Number : ");
                double secondNum = sc.nextInt();

                double result = firstNum / secondNum ;
                System.out.println();
                System.out.println(line);
                System.out.println("Division Result :- " + result);
                System.out.println(line);
                break;
            }
            case 5: {
                System.out.println("Thank You 😇For Using Smart Console Calculator");
                break;
            }

            default: {
                System.out.println("Invalid Choice");
            }
        }

    }
}
