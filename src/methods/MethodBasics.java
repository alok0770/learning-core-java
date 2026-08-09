package methods;

public class MethodBasics {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("          METHOD BASICS             ");
        System.out.println("====================================");

        System.out.println("\n--- Void Methods ---");

        userGreeting("Alok");
        showMessage("Alok");
        printMarks("Alok", 90);

        System.out.println("\n--- Returning Methods ---");

        double squareResult = square(56);
        System.out.println("Square of 56 : " + squareResult);

        System.out.println("Cube of 56 : " + cube(56));

        System.out.println(
                "Full Name : " + getFullName("Alok", "Rana")
        );

        System.out.println("Age Check : " + ageCheck(18));

        System.out.println("\n--- Parameter Method ---");

        showName("Alok");

        System.out.println("\n--- Addition Method ---");

        int additionResult = addition(500, 100);
        System.out.println("500 + 100 = " + additionResult);

        System.out.println("\n====================================");
        System.out.println("        END OF METHOD BASICS        ");
        System.out.println("====================================");
    }

    static void userGreeting(String name) {
        System.out.println("Hello, " + name + ". Welcome to Java Methods!");
    }

    static void showMessage(String name) {
        System.out.println(name + " is Learning Core Java.");
    }

    static void printMarks(String name, int marks) {
        System.out.println(name + "'s Marks in Java : " + marks);
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    static void showName(String name) {
        System.out.println("Name : " + name);
    }

    static int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
