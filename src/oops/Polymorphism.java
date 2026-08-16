package oops;

public class Polymorphism {

    public static void main(String[] args) {

        // Creating objects of different child classes
        Cars cars = new Cars();
        Bike bike = new Bike();
        Boat boat = new Boat();


        // Parent class reference can store child class objects
        // This demonstrates polymorphism
        Vehicles[] vehicles = {bike, boat, cars};


        // Calling the overridden go() method
        // The actual object's method is executed at runtime
        for (Vehicles vehicle : vehicles) {
            vehicle.go();
        }
    }
}


// Abstract parent class
abstract class Vehicles {

    // Abstract method
    // Every child class must provide its own implementation
    abstract void go();
}


// Cars class inherits Vehicles
class Cars extends Vehicles {

    String name = "Alok";


    // Overriding the go() method
    @Override
    public void go() {
        System.out.println(name + " drives the car.");
    }
}


// Bike class inherits Vehicles
class Bike extends Vehicles {

    String name = "Alok";


    // Overriding the go() method
    @Override
    public void go() {
        System.out.println(name + " rides the bike.");
    }
}


// Boat class inherits Vehicles
class Boat extends Vehicles {

    String name = "Alok";


    // Overriding the go() method
    @Override
    public void go() {
        System.out.println(name + " sails the boat.");
    }
}