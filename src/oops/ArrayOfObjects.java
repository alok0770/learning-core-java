package oops;

public class ArrayOfObjects {

    public static void main(String[] args) {

        // Creating an array of Car objects
        Car[] cars = {
                new Car("BMW M3", "White"),
                new Car("Ferrari", "Red"),
                new Car("Tesla", "Blue")
        };

        // Enhanced for loop to access each Car object
        for (Car car : cars) {
            car.drive();
        }
    }
}


// Car class
class Car {

    // Instance variables
    String model;
    String color;


    // Parameterized constructor
    Car(String model, String color) {

        // 'this' refers to the current Car object
        this.model = model;
        this.color = color;
    }


    // Method to display the car details
    void drive() {

        System.out.println(
                "You drive the " + color + " " + model
        );
    }
}