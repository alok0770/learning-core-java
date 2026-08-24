package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // ==========================================
        // Create HashMap
        // Key   → String
        // Value → String
        // ==========================================

        HashMap<String, String> map = new HashMap<>();

        // Add key-value pairs
        map.put("Name", "Alok");
        map.put("Course", "B.C.A");
        map.put("Gender", "Male");
        map.put("Address", "Main Market Uttarkashi");
        map.put("F.name", "Asew");


        // ==========================================
        // Display HashMap
        // ==========================================

        System.out.println("========================================");
        System.out.println("           STUDENT DETAILS");
        System.out.println("========================================");
        System.out.println(map);


        // ==========================================
        // Remove an Entry
        // ==========================================

        map.remove("F.name");

        System.out.println();
        System.out.println("After Removing F.name:");
        System.out.println(map);


        // ==========================================
        // Access Value Using Key
        // ==========================================

        System.out.println();
        System.out.println("Name : " + map.get("Name"));


        // ==========================================
        // Check Key and Value
        // ==========================================

        System.out.println();
        System.out.println("Contains 'Address' Key? : "
                + map.containsKey("Address"));

        System.out.println("Contains 'B.C.A' Value? : "
                + map.containsValue("B.C.A"));


        // ==========================================
        // HashMap Information
        // ==========================================

        System.out.println();
        System.out.println("Total Entries : " + map.size());


        // ==========================================
        // Display All Keys
        // ==========================================

        System.out.println();
        System.out.println("All Keys : " + map.keySet());


        // ==========================================
        // Display All Values
        // ==========================================

        System.out.println("All Values : " + map.values());


        // ==========================================
        // Traversal Using keySet() + get()
        // ==========================================

        System.out.println();
        System.out.println("------ Traversal Using keySet() ------");

        for (String key : map.keySet()) {

            System.out.println(key + " : " + map.get(key));
        }


        // ==========================================
        // Traversal Using entrySet()
        // ==========================================

        System.out.println();
        System.out.println("------ Traversal Using entrySet() ------");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("========================================");
    }
}