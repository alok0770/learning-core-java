package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Alok");
        stack.push("Aman");
        stack.push("Rahul");
        stack.push("Vikas");

        System.out.println("Names Stack : " + stack);

        System.out.println("\nTop element : " + stack.peek());

        stack.pop();
        System.out.println("\nNew stack : " + stack);

        System.out.println("\nAman : " + stack.contains("Aman"));

        System.out.println("\nAlok Position : " + stack.search("Alok"));

        System.out.println("\nStack Size : " + stack.size());
    }
}
