package operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        // Displaying the program title
        System.out.println("====================================");
        System.out.println(" Increment & Decrement Operators ");
        System.out.println("====================================");
        System.out.println();

        // Initial value
        int number1 = 40;

        // Demonstrating Post Increment
        System.out.println("Post Increment (number1++) : " + number1++);
        System.out.println("Current Value              : " + number1);
        System.out.println();

        // Demonstrating Pre Increment
        System.out.println("Pre Increment (++number1)  : " + ++number1);
        System.out.println("Current Value              : " + number1);
        System.out.println();

        // Demonstrating Post Decrement
        System.out.println("Post Decrement (number1--) : " + number1--);
        System.out.println("Current Value              : " + number1);
        System.out.println();

        // Demonstrating Pre Decrement
        System.out.println("Pre Decrement (--number1)  : " + --number1);
        System.out.println("Current Value              : " + number1);
    }
}