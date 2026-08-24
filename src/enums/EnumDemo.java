package enums;

import java.util.Scanner;

public class EnumDemo {

    public static void main(String[] args) {

        // Create Scanner once and reuse it throughout the program
        Scanner input = new Scanner(System.in);

        // ==========================================
        // Day Selection Program
        // ==========================================

        while (true) {

            System.out.println();
            System.out.println("====================================");
            System.out.println("          DAY INFORMATION");
            System.out.println("====================================");
            System.out.println("Enter a day or type EXIT to quit.");
            System.out.print("Your choice : ");

            String response = input.next().toUpperCase();

            // Exit the program when the user enters EXIT
            if (response.equals("EXIT")) {
                System.out.println();
                System.out.println("====================================");
                System.out.println("          Program Exited");
                System.out.println("====================================");
                break;
            }

            try {

                // Convert the user's input into a Day enum constant
                Day day = Day.valueOf(response);

                // Display selected day and its number
                System.out.println();
                System.out.println("------------------------------------");
                System.out.println("Selected Day : " + day);
                System.out.println("Day Number   : " + day.getDayNumber());

                // Check whether the selected day is a weekday or weekend
                switch (day) {

                    case MONDAY, TUESDAY, WEDNESDAY,
                         THURSDAY, FRIDAY, SATURDAY ->

                            System.out.println("Type         : Weekday");

                    case SUNDAY ->

                            System.out.println("Type         : Weekend");
                }

                System.out.println("------------------------------------");

            }

            // Handle invalid day names
            catch (IllegalArgumentException e) {

                System.out.println();
                System.out.println("Error: Please enter a valid day.");
                System.out.println("Example: MONDAY, TUESDAY, SUNDAY");

            }
        }

        // Close Scanner
        input.close();
    }
}