package oops;

public class ToStringMethod {

    public static void main(String[] args) {

        // Creating Vehicle objects
        Vehicle vehicle = new Vehicle(
                "Ford",
                "Mustang",
                2025,
                "Red"
        );

        Vehicle vehicle1 = new Vehicle(
                "BMW",
                "M3",
                2026,
                "White"
        );


        // Printing Vehicle objects
        // Java automatically calls the overridden toString() method
        System.out.println("========================================");
        System.out.println("           VEHICLE DETAILS");
        System.out.println("========================================");

        System.out.println(vehicle);

        System.out.println("----------------------------------------");

        System.out.println(vehicle1);

        System.out.println("========================================");
    }
}


// Vehicle class
class Vehicle {

    // Instance variables
    String make;
    String model;
    int year;
    String color;


    // Parameterized constructor
    Vehicle(String make, String model, int year, String color) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    // Overriding the toString() method inherited from Object class
    @Override
    public String toString() {

        // Returning a readable String representation of the object
        return "Make  : " + this.make
                + "\nModel : " + this.model
                + "\nYear  : " + this.year
                + "\nColor : " + this.color;
    }
}