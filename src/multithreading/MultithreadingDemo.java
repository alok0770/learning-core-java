package multithreading;

public class MultithreadingDemo {

    public static void main(String[] args) {

        System.out.println("Game Start!");

        // Create two threads with different tasks
        Thread pingThread = new Thread(new MyRunnable("Ping"));
        Thread pongThread = new Thread(new MyRunnable("Pong"));

        try {
            // Start both threads
            pingThread.start();
            pongThread.start();

            // Main thread waits for both threads to finish
            pingThread.join();
            pongThread.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // This executes after both threads have completed
        System.out.println("Game Over!!");
    }
}


// Runnable task used by both threads
class MyRunnable implements Runnable {

    private final String text;

    MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {

        // Print the message five times
        for (int i = 1; i <= 5; i++) {

            try {
                // Pause the current thread for 900 milliseconds
                Thread.sleep(900);

                // Display the current thread name and its message
                System.out.println(
                        Thread.currentThread().getName() + " : " + text
                );

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}