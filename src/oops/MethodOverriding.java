package oops;

public class MethodOverriding {

    public static void main(String[] args) {

        // Creating objects of different animal classes
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        // Program heading
        System.out.println("========================================");
        System.out.println("          METHOD OVERRIDING");
        System.out.println("========================================");

        // Calling move() method for Dog
        System.out.println("\nDog:");
        dog.move();

        // Calling move() method for Cat
        System.out.println("\nCat:");
        cat.move();

        // Calling overridden move() method for Fish
        System.out.println("\nFish:");
        fish.move();

        // End of program
        System.out.println("\n========================================");
    }
}


// Parent class
class Animal {

    // Parent class method
    void move() {
        System.out.println("This animal is running.");
    }
}


// Dog inherits the move() method from Animal
class Dog extends Animal {

}


// Cat inherits the move() method from Animal
class Cat extends Animal {

}


// Fish inherits Animal and overrides the move() method
class Fish extends Animal {

    // Overriding the parent class move() method
    @Override
    void move() {
        System.out.println("This animal is swimming.");
    }
}