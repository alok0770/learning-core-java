package conditionals;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {

        // Enhanced Switch Statement (Java 14)
        // A cleaner replacement for multiple if-else statements.

        Scanner input = new Scanner(System.in);

        String day;

        System.out.print("Enter the Day of the Week : ");
        day = input.nextLine().toLowerCase();

        switch (day) {

            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println(day + " is a Weekday.");

            case "saturday", "sunday" ->
                    System.out.println(day + " is a Weekend.");

            default ->
                    System.out.println(day + " is not a valid day.");
        }

        input.close();
    }
}