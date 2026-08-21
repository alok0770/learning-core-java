package mini_projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args) {

        // ==========================================
        // Audio File Path
        // ==========================================

        String filePath = "src//LoveYourself.wav";

        File file = new File(filePath);

        // ==========================================
        // Music Player
        // ==========================================

        try (
                Scanner input = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)
        ) {

            // Create a Clip object for audio playback
            Clip clip = AudioSystem.getClip();

            // Open the audio stream using the Clip
            clip.open(audioStream);

            // Start playing the song
            clip.start();

            System.out.println("========================================");
            System.out.println("          JAVA MUSIC PLAYER");
            System.out.println("========================================");
            System.out.println("Now Playing : Love Yourself...");
            System.out.println();

            String response = "";

            // Keep the music player running until user chooses Q
            while (!response.equals("Q")) {

                System.out.println("----------------------------------------");
                System.out.println("P  → Play");
                System.out.println("S  → Stop");
                System.out.println("R  → Reset & Play");
                System.out.println("Q  → Quit");
                System.out.println("----------------------------------------");

                System.out.print("Enter your choice : ");
                response = input.next().toUpperCase();

                switch (response) {

                    // Play or resume the audio
                    case "P" -> {
                        clip.start();
                        System.out.println("Music playing...");
                    }

                    // Stop the audio at the current position
                    case "S" -> {
                        clip.stop();
                        System.out.println("Music stopped.");
                    }

                    // Move to the beginning and start playing again
                    case "R" -> {
                        clip.setMicrosecondPosition(0);
                        clip.start();
                        System.out.println("Music restarted.");
                    }

                    // Close the Clip and exit the player
                    case "Q" -> {
                        clip.close();
                        System.out.println("Closing music player...");
                    }

                    // Handle invalid input
                    default -> {
                        System.out.println("Invalid choice! Please enter P, S, R, or Q.");
                    }
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("Error: Audio file not found.");

        } catch (UnsupportedAudioFileException e) {

            System.out.println("Error: Unsupported audio format.");

        } catch (LineUnavailableException e) {

            System.out.println("Error: Unable to access audio resources.");

        } catch (IOException e) {

            System.out.println("Error: Something went wrong while reading the audio file.");

        } finally {

            System.out.println();
            System.out.println("========================================");
            System.out.println("        Thanks for using the player!");
            System.out.println("========================================");
        }
    }
}