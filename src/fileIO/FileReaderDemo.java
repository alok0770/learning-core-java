package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {

        // Path of the file to be read
        String filePath = "/Users/alokrana/Desktop/StudentInformation.txt";

        // ==========================================
        // File Reading with Exception Handling
        // ==========================================

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            System.out.println("====================================");
            System.out.println("         FILE READ SUCCESSFUL");
            System.out.println("====================================");

            String line;

            // Read the file line by line until the end of file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("====================================");

        }

        // Handle file not found exception
        catch (FileNotFoundException e) {

            System.out.println("Error : Could not find the specified file.");

        }

        // Handle other input/output exceptions
        catch (IOException e) {

            System.out.println("Error : Something went wrong while reading the file.");

        }
    }
}