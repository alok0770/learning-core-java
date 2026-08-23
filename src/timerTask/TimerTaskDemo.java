package timerTask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {

    public static void main(String[] args) {

        // ==========================================
        // Create Timer
        // ==========================================

        Timer timer = new Timer();

        // ==========================================
        // Create TimerTask using Anonymous Class
        // ==========================================

        TimerTask task = new TimerTask() {

            int count = 5;

            @Override
            public void run() {

                // Execute the task every time the timer runs it
                System.out.println("Task is running...");

                // Decrease the counter after each execution
                count--;

                // Stop the timer when the counter reaches zero
                if (count <= 0) {

                    System.out.println("Task is completed!");

                    timer.cancel();
                }
            }
        };

        // Schedule the task:
        // 1000 ms delay before first execution
        // 1000 ms interval between repeated executions
        timer.schedule(task, 1000, 1000);
    }
}