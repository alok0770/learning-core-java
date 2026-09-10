package collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) throws InterruptedException {

        // Create a thread-safe CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add initial elements
        list.add("Alok");
        list.add("Aman");
        list.add("Rahul");
        list.add("Vikas");

        // Create reader and writer tasks using the same list
        Reader reader = new Reader(list);
        Writer writer = new Writer(list);

        // Create threads for both tasks
        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        // Start both threads
        readerThread.start();
        writerThread.start();

        // Give both threads enough time to complete
        Thread.sleep(5000);

        // Display the final modified list
        System.out.println("\nFinal List : " + list);
    }
}


// Reads the list while another thread may modify it
class Reader implements Runnable {

    private final CopyOnWriteArrayList<String> list;

    Reader(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {

        // Iterate through the list
        for (String name : list) {

            System.out.println("Reading : " + name);

            try {
                // Pause the reader to allow the writer thread to modify the list
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Reader thread was interrupted.");
                return;
            }
        }
    }
}


// Modifies the shared list
class Writer implements Runnable {

    private final CopyOnWriteArrayList<String> list;

    Writer(CopyOnWriteArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {

        // Add elements at different positions
        list.add(3, "Ram");
        list.add(1, "Piyush");
        list.add(0, "Arjun");
    }
}