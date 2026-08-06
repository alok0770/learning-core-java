package practice;

import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {

        // Formula: c = √(a² + b²)
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("====================================");
        System.out.println("      HYPOTENUSE CALCULATOR         ");
        System.out.println("====================================");
        System.out.println();

        // Taking input for side A
        System.out.print("Enter the length of Side A : ");
        a = input.nextDouble();

        // Taking input for side B
        System.out.print("Enter the length of Side B : ");
        b = input.nextDouble();

        // Calculating the hypotenuse using Pythagorean Theorem
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Displaying the result
        System.out.println("The hypotenuse (Side C) is : " + c + " cm");

        // Closing the Scanner object
        input.close();
    }
}


// commit = git commit -m "Add hypotenuse calculator using Math class"