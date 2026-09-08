package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Alok");
        names.add("Aman");
        names.add("Rahul");

        names.addFirst("Abdul");
        names.addLast("Vikas");

        System.out.println("Names -> " + names + "\n");
        System.out.println("First name : " + names.getFirst() + "\nLast name : " + names.getLast());

        names.remove("Rahul");

        System.out.println("\n" + "Names -> " + names);
    }
}
