package timerTask;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==========================================
        // Get Countdown Value From User
        // ==========================================

        System.out.print("Enter the countdown: ");
        int response = input.nextInt();

        // Create a Timer to schedule the countdown task
        Timer timer = new Timer();

        // ==========================================
        // Create Countdown TimerTask
        // ==========================================

        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {

                // Display the current countdown value
                System.out.println("Countdown : " + count);

                // Decrease the counter after every execution
                count--;

                // Stop the timer after countdown reaches zero
                if (count < 0) {

                    System.out.println();
                    System.out.println("🎉 Happy New Year! 🎉");

                    timer.cancel();
                }
            }
        };

        // Start immediately and execute every 1 second
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}