package conditionals;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        // Ternary Operator:
        // Returns one of two values based on a condition.
        // Syntax:
        // variable = (condition) ? valueIfTrue : valueIfFalse;

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       TERNARY OPERATOR");
        System.out.println("================================");
        System.out.println();

        int marks;

        System.out.print("Enter Your Marks : ");
        marks = input.nextInt();

        // Determines whether the student passed or failed
        String result = (marks >= 50) ? "Pass" : "Fail";

        // Determines the grade using nested ternary operators
        String grade = (marks >= 90) ? "A+"
                : (marks >= 80) ? "A"
                  : (marks >= 70) ? "B+"
                    : (marks >= 60) ? "B"
                      : (marks >= 50) ? "C"
                        : "Fail";

        System.out.println("------------------------------");
        System.out.println("Marks  : " + marks);
        System.out.println("Result : " + result);
        System.out.println("Grade  : " + grade);
        System.out.println("------------------------------");

        input.close();
    }
}