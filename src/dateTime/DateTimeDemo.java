package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {

        // ==========================================
        // Current Date
        // ==========================================

        LocalDate date = LocalDate.now();

        System.out.println("Current Date : " + date);


        // ==========================================
        // Current Time
        // ==========================================

        LocalTime time = LocalTime.now();

        System.out.println("Current Time : " + time);


        // ==========================================
        // Current Date and Time
        // ==========================================

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date & Time : " + dateTime);


        // ==========================================
        // Custom Date and Time Format
        // ==========================================

        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a custom formatter
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy     HH : mm : ss");

        // Format the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Formatted Date & Time : " + formattedDateTime);


        // ==========================================
        // Creating a Specific Date and Time
        // ==========================================

        LocalDateTime birthDateTime =
                LocalDateTime.of(2027, 6, 8, 12, 0, 0);

        System.out.println("-------------------------------------");
        System.out.println("Alok Birth Date & Time : " + birthDateTime);
        System.out.println("-------------------------------------");
    }
}