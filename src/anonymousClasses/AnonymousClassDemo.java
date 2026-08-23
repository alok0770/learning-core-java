package anonymousClasses;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        // ==========================================
        // Normal Dog Object
        // ==========================================

        Dog dog1 = new Dog();

        // ==========================================
        // Anonymous Class
        // ==========================================
        // Creates an unnamed subclass of Dog and
        // overrides the speak() method.

        Dog dog2 = new Dog() {

            @Override
            void speak() {
                System.out.println("Scooby Doo says: Ruh Roh!");
            }
        };

        // ==========================================
        // Calling Methods
        // ==========================================

        dog1.speak();
        dog2.speak();
    }
}


// ==========================================
// Dog Class
// ==========================================

class Dog {

    // Default behavior of a Dog
    void speak() {
        System.out.println("The dog barks: Woof Woof!");
    }
}