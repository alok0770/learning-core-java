package practice;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      TEMPERATURE CONVERTER");
        System.out.println("====================================");
        System.out.println();

        double temperature;
        double newTemperature;
        String unit;

        // Taking temperature input
        System.out.print("Enter the Temperature : ");
        temperature = input.nextDouble();

        // Asking the user which unit they want to convert to
        System.out.print("Convert To (C/F) : ");
        unit = input.next().toUpperCase();

        // Converting the temperature using the ternary operator
        newTemperature = (unit.equals("C"))
                ? (temperature - 32) * 5 / 9
                : (temperature * 9 / 5) + 32;

        System.out.println("------------------------------------");
        System.out.printf("Converted Temperature : %.2f °%s%n", newTemperature, unit);
        System.out.println("------------------------------------");

        input.close();
    }
}