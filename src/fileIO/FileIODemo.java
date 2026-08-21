package fileIO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {

    public static void main(String[] args) {

        // File path where the student information will be stored
        String filePath = "/Users/alokrana/Desktop/StudentInformation.txt";

        // Data to be written into the file
        String studentInfo =
                "Student Information\n" +
                        "-------------------\n" +
                        "Name    : Alok\n" +
                        "Age     : 20\n" +
                        "Course  : BCA\n" +
                        "Semester: 5\n" +
                        "Skill   : Java\n" +
                        "Goal    : Java Backend Developer\n" +
                        "\n" +
                        "Currently learning:\n" +
                        "- Core Java\n" +
                        "- DSA\n" +
                        "- SQL\n" +
                        "- Spring Boot";

        // ==========================================
        // File I/O with Exception Handling
        // ==========================================

        try (FileWriter writer = new FileWriter(filePath)) {

            // Write student information into the file
            writer.write(studentInfo);

            System.out.println("====================================");
            System.out.println("       FILE WRITE SUCCESSFUL");
            System.out.println("====================================");
            System.out.println("File : " + filePath);
            System.out.println("Student information has been written successfully.");

        }

        // Handle file-related errors
        catch (FileNotFoundException e) {

            System.out.println("Error : Could not locate the file or directory.");

        }

        // Handle other I/O-related errors
        catch (IOException e) {

            System.out.println("Error : Could not write data to the file.");

        }
    }
}