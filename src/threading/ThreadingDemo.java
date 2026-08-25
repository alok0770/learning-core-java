package threading;

import java.util.Scanner;

public class ThreadingDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a Runnable object
        MyRunnable runnable = new MyRunnable();

        // Create a Thread and pass the Runnable task
        Thread thread = new Thread(runnable);

        // Start the new thread
        thread.start();

        System.out.println();
        System.out.println("=============================================");
        System.out.println(" You have only 5 seconds to enter your name!");
        System.out.println("=============================================");

        System.out.print("Enter your name : ");

        // Main thread waits for user input
        String name = scanner.nextLine().toUpperCase();

        System.out.println("Your Name : " + name);

        scanner.close();
    }
}


// Runnable class contains the task that the new thread will perform
class MyRunnable implements Runnable {

    @Override
    public void run() {

        // Run the timer for 5 seconds
        for (int i = 0; i < 5; i++) {

            try {

                // Pause the current thread for 1 second
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println("Thread was interrupted.");
            }
        }

        // This message is displayed after 5 seconds
        System.out.println("\nTime's up !!");

        // End the program
        System.exit(0);
    }
}