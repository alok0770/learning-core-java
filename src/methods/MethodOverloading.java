package methods;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       METHOD OVERLOADING");
        System.out.println("================================");
        System.out.println();

        // Calls the method with two parameters
        System.out.println("Addition of 50 and 50 : " + addition(50, 50));

        // Calls the overloaded method with three parameters
        System.out.println(
                "Addition of 20, 40 and 56 : " + addition(20, 40, 56)
        );
    }

    // Method with two parameters
    static int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    // Overloaded method with three parameters
    static int addition(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;
    }
}