package mathclass;

public class MathClassBasics {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("       MATH CLASS OPERATIONS        ");
        System.out.println("====================================");
        System.out.println();

        // Displaying mathematical constants
        System.out.println("Value of PI : " + Math.PI);
        System.out.println("\nValue of Euler's Number (E) : " + Math.E);

        double result;

        // Finding the power of a number
        result = Math.pow(2, 7);
        System.out.println("\n2 raised to the power of 7 : " + result);

        // Finding the square root
        result = Math.sqrt(9);
        System.out.println("\nSquare Root of 9 : " + result);

        // Rounding a decimal number
        result = Math.round(15.56);
        System.out.println("\nRound of 15.56 : " + result);

        // Finding the maximum value
        result = Math.max(10, 23);
        System.out.println("\nMaximum Number : " + result);

        // Finding the minimum value
        result = Math.min(10, 23);
        System.out.println("\nMinimum Number : " + result);
    }
}