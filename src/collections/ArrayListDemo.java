package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        // ==========================================
        // Integer ArrayList
        // ==========================================

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        // Updating element at index 1
        numbers.set(1, 8);

        System.out.println("========== INTEGER ARRAYLIST ==========");
        System.out.println("Elements       : " + numbers);
        System.out.println("======================================");

        System.out.println();


        // ==========================================
        // Double ArrayList
        // ==========================================

        ArrayList<Double> decimalNumbers = new ArrayList<>();

        // Adding decimal values
        decimalNumbers.add(23.56);
        decimalNumbers.add(65.78);
        decimalNumbers.add(2.44);

        System.out.println("========== DOUBLE ARRAYLIST ==========");
        System.out.println("Elements        : " + decimalNumbers);
        System.out.println("Element at [2]  : " + decimalNumbers.get(2));
        System.out.println("Contains 65.78? : " + decimalNumbers.contains(65.78));
        System.out.println("======================================");

        System.out.println();


        // ==========================================
        // String ArrayList
        // ==========================================

        ArrayList<String> fruits = new ArrayList<>();

        // Adding fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println("========== STRING ARRAYLIST ==========");
        System.out.println("Original List : " + fruits);

        // Removing element at index 3
        fruits.remove(3);

        System.out.println("After Remove  : " + fruits);
        System.out.println("Current Size   : " + fruits.size());

        // Sorting the ArrayList alphabetically
        Collections.sort(fruits);

        System.out.println("After Sorting  : " + fruits);
        System.out.println("======================================");
    }
}