package oops;

public class Composition {

    public static void main(String[] args) {

        // Creating a Bikes object
        // The Engine object will be created inside the Bikes constructor
        Bikes bikes = new Bikes(
                "Hunter 350",
                "White",
                2023,
                30,
                350
        );

        // Displaying bike details
        bikes.display();
    }
}


// ========================================
//              BIKES CLASS
// ========================================

class Bikes {

    String model;
    String color;
    int year;
    int mileage;

    // Composition:
    // Bikes has an Engine object
    Engine engine;


    // Bikes constructor
    Bikes(String model, String color, int year, int mileage, int engineType) {

        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;

        // Creating the Engine object inside Bikes
        // This represents a strong HAS-A relationship
        this.engine = new Engine(engineType);
    }


    // Method to display bike details
    void display() {

        System.out.println("========================================");
        System.out.println("             BIKE DETAILS");
        System.out.println("========================================");

        System.out.println("Bike Model   : " + this.model);
        System.out.println("Bike Color   : " + this.color);
        System.out.println("Release Year : " + this.year);
        System.out.println("Mileage      : " + this.mileage + " km");
        System.out.println("Bike CC      : " + this.engine.type + " cc");

        System.out.println("========================================");
    }
}


// ========================================
//              ENGINE CLASS
// ========================================

class Engine {

    int type;


    // Engine constructor
    Engine(int type) {
        this.type = type;
    }
}