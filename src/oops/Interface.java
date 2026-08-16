package oops;

public class Interface {

    public static void main(String[] args) {

        // Creating objects
        Rabbit rabbit = new Rabbit();
        Hawks hawks = new Hawks();
        Fishes fishes = new Fishes();


        // Output header
        System.out.println("========================================");
        System.out.println("           INTERFACE EXAMPLE");
        System.out.println("========================================");


        // Rabbit implements Prey interface
        rabbit.flee();

        // Hawks implements Predator interface
        hawks.hunt();

        // Fish implements both Prey and Predator interfaces
        fishes.flee();
        fishes.hunt();


        // Output footer
        System.out.println("========================================");
    }
}


// Rabbit implements the Prey interface
class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("The rabbit is running away.");
    }
}


// Fish implements multiple interfaces
// Fish is both a Prey and a Predator
class Fishes implements Prey, Predator {

    // Implementation of Prey interface method
    @Override
    public void flee() {
        System.out.println("The fish is swimming away.");
    }


    // Implementation of Predator interface method
    @Override
    public void hunt() {
        System.out.println("The fish is hunting another small fish.");
    }
}


// Hawks implements the Predator interface
class Hawks implements Predator {

    @Override
    public void hunt() {
        System.out.println("The hawk is hunting.");
    }
}