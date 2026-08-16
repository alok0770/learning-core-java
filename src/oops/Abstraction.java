package oops;

public class Abstraction {

    public static void main(String[] args) {

        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(3, 2);

        System.out.println("========================================");
        System.out.println("          SHAPE AREA CALCULATION");
        System.out.println("========================================");

        System.out.printf("Circle Area    : %.2f%n", circle.area());
        System.out.printf("Triangle Area  : %.2f%n", triangle.area());
        System.out.printf("Rectangle Area : %.2f%n", rectangle.area());

        System.out.println("========================================");
    }
}


// Abstract parent class
abstract class Shape {

    // Abstract method
    // Child classes must provide its implementation
    abstract double area();


    // Concrete method
    // Abstract classes can also contain normal methods
    void display() {
        System.out.println("This is a shape.");
    }
}


// Circle inherits Shape
class Circle extends Shape {

    double radius;


    // Circle constructor
    Circle(double radius) {
        this.radius = radius;
    }


    // Implementing the abstract area() method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}


// Triangle inherits Shape
class Triangle extends Shape {

    double base;
    double height;


    // Triangle constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    // Implementing the abstract area() method
    @Override
    double area() {
        return 0.5 * base * height;
    }
}


// Rectangle inherits Shape
class Rectangle extends Shape {

    double length;
    double width;


    // Rectangle constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // Implementing the abstract area() method
    @Override
    double area() {
        return length * width;
    }
}