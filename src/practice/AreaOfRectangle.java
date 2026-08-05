package practice;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        // Variables to store rectangle dimensions and area
        double width;
        double height;
        double area;

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking width as input
        System.out.print("Enter Width of a Rectangle : ");
        width = input.nextDouble();

        // Taking height as input
        System.out.print("Enter Height of a Rectangle : ");
        height = input.nextDouble();

        // Calculating the area of the rectangle
        area = width * height;

        // Displaying the calculated area
        System.out.println("The Area is : " + area + " cm²");

        // Closing the Scanner object
        input.close();
    }
}