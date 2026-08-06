package practice;

import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {

        // Formulas:
        // Circumference = 2 × π × r
        // Area = π × r²
        // Sphere Volume = (4.0/3.0) × π × r³

        System.out.println("====================================");
        System.out.println("        CIRCLE CALCULATOR           ");
        System.out.println("====================================");
        System.out.println();

        Scanner input = new Scanner(System.in);

        // Creating variables
        double radius;
        double circumference;
        double area;
        double volume;

        // Taking user input
        System.out.print("Enter the Radius : ");
        radius = input.nextDouble();

        // Calculating the circumference
        circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference : %.1f cm " , circumference );

        // Calculating the area
        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("\nArea : %.1f cm² " , area);

        // Calculating the volume of a sphere
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("\nVolume of a Sphere : %.1f cm³%n" , volume);

        // Closing the Scanner object
        input.close();
    }
}