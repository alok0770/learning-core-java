package mini_projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner input;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner input) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.input = input;
    }

    @Override
    public void run() {

        // Display the current time until the alarm time is reached
        while (LocalTime.now().isBefore(alarmTime)) {

            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf(
                        "\rCurrent Time : %02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond()
                );

            } catch (InterruptedException e) {
                System.out.println("\nThread was interrupted!");
            }
        }

        // Alarm time has been reached
        System.out.println("\n\n================================");
        System.out.println("          ALARM !!");
        System.out.println("================================");
        System.out.println("Alarm Time : " + alarmTime);
        System.out.println();

        playSound(filePath);
    }

    // Play the alarm sound
    private void playSound(String filePath) {

        File audioFile = new File(filePath);

        try (AudioInputStream audioStream =
                     AudioSystem.getAudioInputStream(audioFile)) {

            Clip clip = AudioSystem.getClip();

            clip.open(audioStream);
            clip.start();

            System.out.println("🔔 Alarm is ringing...");
            System.out.println("Press ENTER to stop the alarm.");

            input.nextLine();

            clip.stop();
            clip.close();

            System.out.println("Alarm stopped.");

        } catch (UnsupportedAudioFileException e) {

            System.out.println("Audio file format is not supported!");

        } catch (LineUnavailableException e) {

            System.out.println("Audio resources are unavailable!");

        } catch (IOException e) {

            System.out.println("Error reading the audio file!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        String filePath = "src//LoveYourself.wav";

        System.out.println("================================");
        System.out.println("         ALARM CLOCK");
        System.out.println("================================");
        System.out.println();

        // Keep asking until the user enters a valid time
        while (alarmTime == null) {

            try {
                System.out.print("Enter alarm time (HH:mm:ss) : ");

                String inputTime = input.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);

                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Alarm set for : " + alarmTime);
                System.out.println("--------------------------------");
                System.out.println();

            } catch (DateTimeParseException e) {

                System.out.println();
                System.out.println(
                        "Invalid time! Please use HH:mm:ss format."
                );
                System.out.println();
            }
        }

        // Create the alarm task
        AlarmClock alarmClock =
                new AlarmClock(alarmTime, filePath, input);

        // Create and start the alarm thread
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

        try {
            // Wait for the alarm thread to finish
            alarmThread.join();

        } catch (InterruptedException e) {

            System.out.println("Main thread was interrupted!");
        }

        input.close();
    }
}