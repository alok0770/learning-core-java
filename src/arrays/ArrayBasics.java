package arrays;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // Create a String array
        String[] fruits = {"Apple", "Banana", "Guava", "Orange"};

        // --------------------------------------------------
        // 1. Updating an Array Element
        // --------------------------------------------------

        // Replace the element at index 0
        fruits[0] = "Pineapple";

        System.out.println("1. Updated Element:");
        System.out.println("Index 0 -> " + fruits[0]);

        // --------------------------------------------------
        // 2. Print Complete Array using Arrays.toString()
        // --------------------------------------------------

        System.out.println("\n2. Using Arrays.toString():");
        System.out.println(Arrays.toString(fruits));

        // --------------------------------------------------
        // 3. Print Array using Normal for Loop
        // --------------------------------------------------

        // Normal for loop is useful when the index is required
        System.out.println("\n3. Using Normal for Loop:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + " -> " + fruits[i]);
        }

        // --------------------------------------------------
        // 4. Print Array using Enhanced for Loop
        // --------------------------------------------------

        // Enhanced for loop is useful when only elements are required
        System.out.println("\n4. Using Enhanced for Loop:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // --------------------------------------------------
        // 5. Sort the Array
        // --------------------------------------------------

        // Arrays.sort() sorts the elements in ascending order
        Arrays.sort(fruits);

        System.out.println("\n5. After Sorting:");
        System.out.println(Arrays.toString(fruits));
    }
}