package operators;

public class AugmentedAssignmentOperators {
    public static void main(String[] args) {

        // Displaying the program title
        System.out.println("====================================");
        System.out.println("   Augmented Assignment Operators   ");
        System.out.println("====================================");
        System.out.println();

        // Initial values for demonstration
        int firstNum = 126;
        int secondNum = 56;

        // Demonstrating Augmented Assignment Operators

        int addition = firstNum;
        addition += secondNum;

        int subtraction = firstNum;
        subtraction -= secondNum;

        int multiplication = firstNum;
        multiplication *= secondNum;

        int division = firstNum;
        division /= secondNum;

        int modulus = firstNum;
        modulus %= secondNum;

        // Displaying the result of each operation
        System.out.println("Addition : " + addition);
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division : " + division);
        System.out.println("Modulus : " + modulus);

    }
}