package generics;

public class GenericsDemo {

    public static void main(String[] args) {

        // ==========================================
        // Generic Class - Box<T>
        // ==========================================

        Box<String> box = new Box<>();
        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();
        Box<Boolean> box3 = new Box<>();

        // Set values of different data types
        box.setItem("Alok");
        box1.setItem(100);
        box2.setItem(7.2);
        box3.setItem(true);

        // Display Box values
        System.out.println("========== GENERIC CLASS: BOX ==========");
        System.out.println("Name      : " + box.getItem());
        System.out.println("Marks     : " + box1.getItem());
        System.out.println("CGPA      : " + box2.getItem());
        System.out.println("Student   : " + box3.getItem());
        System.out.println("========================================");
        System.out.println();


        // ==========================================
        // Generic Class with Multiple Type Parameters
        // ==========================================

        Product<String, Integer> product =
                new Product<>("iPhone 17", 83000);

        System.out.println("======= MULTIPLE TYPE PARAMETERS =======");
        System.out.println("Item      : " + product.getItem());
        System.out.println("Price     : " + product.getPrice());
        System.out.println("========================================");
        System.out.println();


        // ==========================================
        // Generic Method
        // ==========================================

        Student student = new Student();
        Student student1 = new Student();

        System.out.println("============ GENERIC METHOD ============");

        // T = String, U = String
        student.displayStudent("Alok", "B.C.A");

        System.out.println("----------------------------------------");

        // T = String, U = Integer
        student1.displayStudent("Rohan", 509);

        System.out.println("========================================");
    }
}


// ==========================================
// Generic Class
// ==========================================

class Box<T> {

    T item;

    // Set a value of generic type T
    public void setItem(T item) {
        this.item = item;
    }

    // Return the value of generic type T
    public T getItem() {
        return this.item;
    }
}


// ==========================================
// Generic Class with Two Type Parameters
// ==========================================

class Product<T, U> {

    T item;
    U price;

    // Constructor using two generic types
    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    // Return item of type T
    public T getItem() {
        return this.item;
    }

    // Return price of type U
    public U getPrice() {
        return this.price;
    }
}


// ==========================================
// Normal Class with Generic Method
// ==========================================

class Student {

    // Generic method with two type parameters
    public <T, U> void displayStudent(T name, U course) {

        System.out.println("Name      : " + name);
        System.out.println("Course    : " + course);
    }
}