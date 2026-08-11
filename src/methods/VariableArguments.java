package methods;

public class VariableArguments {
    public static void main(String[] args) {

        // Add multiple numbers using Varargs
        int result = add(50, 12, 12, 12);

        System.out.println();
        System.out.println("================================");
        System.out.println("       SUM CALCULATION");
        System.out.println("================================");
        System.out.println("Sum of numbers : " + result);

        // Calculate average of multiple marks using Varargs
        double averageResult = showAverage(50, 12, 12, 12);

        System.out.println();
        System.out.println("================================");
        System.out.println("      AVERAGE CALCULATION");
        System.out.println("================================");
        System.out.println("Total Average  : " + averageResult);
        System.out.println("================================");
    }

    // Accepts a variable number of integer arguments
    // and returns their total sum.
    static int add(int... numbers) {

        int sum = 0;

        // Enhanced for loop to access each number
        System.out.print("Numbers = ");
        for (int number : numbers) {
            sum += number;
            System.out.print(number + " ");
        }

        return sum;
    }

    // Accepts a variable number of marks
    // and returns their average.
    static double showAverage(double... marks) {

        double sum = 0;

        // Handle the case when no marks are provided
        if (marks.length == 0) {
            return 0;
        }

        // Calculate the total of all marks
        for (double mark : marks) {
            sum += mark;
        }

        // Return the average
        return sum / marks.length;
    }
}

