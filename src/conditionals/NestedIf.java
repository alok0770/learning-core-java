package conditionals;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        boolean isStudent;
        boolean isSenior;
        int price = 100;

        // Display ticket information
        System.out.println("   MOVIE TICKET   ");
        System.out.println("----------------\n");

        System.out.println("Price : ₹" + price);
        System.out.println("----------------\n");

        // Taking user input
        System.out.print("Are You A Student? : ");
        isStudent = input.nextBoolean();

        System.out.print("Are You A Senior? : ");
        isSenior = input.nextBoolean();

        // Checking whether the customer is a student
        if (isStudent) {

            // Student + Senior
            if (isSenior) {
                System.out.println("You Get A Senior Discount Of 20%");
                System.out.println("You Get A Student Discount Of 10%\n");
                System.out.println("Price Of Ticket Is : ₹" + (price - (price * 30 / 100)));

            }
            // Student only
            else {
                System.out.println("You Get A Student Discount Of 10%\n");
                System.out.println("Price Of Ticket Is : ₹" + (price - (price * 10 / 100)));
            }

        }
        // Customer is not a student
        else {

            // Senior only
            if (isSenior) {
                System.out.println("You Get A Senior Discount Of 20%\n");
                System.out.println("Price Of Ticket Is : ₹" + (price - (price * 20 / 100)));

            }
            // No discount
            else {
                System.out.println("The Ticket Price Is : ₹" + price);
            }
        }

        // Closing the Scanner object
        input.close();
    }
}