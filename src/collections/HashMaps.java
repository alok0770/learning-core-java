package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();

        students.put(1 , "Alok");
        students.put(2 , "Aman");
        students.put(3 , "Alex");
        students.put(4 , "Rohan");
        students.put(5 , "Carlos");


        System.out.println("Hash Map : " + students + "\n");

        System.out.println("Roll No 4 : " + students.get(4));

        System.out.println(students.containsKey(3));

        System.out.println( "\nAlok : " + students.containsValue("Alok"));

        students.replace( 2 , "Oliver");

        students.putIfAbsent(6 , "Aman");

        students.remove(3);

        System.out.println("Size : " + students.size());

        System.out.println(students.keySet());

        System.out.println(students.values() + "\n");

        for(Map.Entry<Integer , String> entry : students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nFinal HashMap : " + students);

    }
}
