package methods;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("    METHOD OVERLOADING PRACTICE");
        System.out.println("================================");
        System.out.println();

        // Calls the method with one parameter
        System.out.println(bakePizza("Plain"));

        // Calls the overloaded method with two parameters
        System.out.println(bakePizza("Plain", "Mozzarella"));

        // Calls the overloaded method with three parameters
        System.out.println(
                bakePizza("Plain", "Mozzarella", "Mushroom")
        );
    }

    // Method with one parameter
    static String bakePizza(String bread) {
        return bread + " Pizza";
    }

    // Overloaded method with two parameters
    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " Pizza";
    }

    // Overloaded method with three parameters
    static String bakePizza(String bread,  String cheese,String toppings){
        return cheese + " " + bread + " " + toppings + " Pizza";
    }
}