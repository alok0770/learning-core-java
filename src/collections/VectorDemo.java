package collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Number -> " + numbers + "\n");

        System.out.println("Size : " + numbers.size() + "\nCapacity : " + numbers.capacity());

        numbers.set(4, 100);
        numbers.remove(2);
        System.out.println("\nNumbers -> " + numbers + "\n");
        System.out.println("Size : " + numbers.size() + "\nCapacity : " + numbers.capacity());

        System.out.println("\n" + numbers.contains(30));
    }
}
