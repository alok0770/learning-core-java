package mini_projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {

        // Path of the file containing game words
        String filePath = "src//words.txt";

        // Store all words read from the file
        ArrayList<String> words = new ArrayList<>();

        // ==========================================
        // Read Words From File
        // ==========================================

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

        } catch (FileNotFoundException e) {

            System.out.println("Error: Could not find the words file.");

        } catch (IOException e) {

            System.out.println("Error: Something went wrong while reading the file.");
        }

        // Select a random word from the ArrayList
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner input = new Scanner(System.in);

        // Store the current hidden state of the word
        ArrayList<Character> wordState = new ArrayList<>();

        // Count the number of wrong guesses
        int wrongGuess = 0;

        // Fill the word state with underscores
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        // ==========================================
        // Game Introduction
        // ==========================================

        System.out.println("======================================");
        System.out.println("         JAVA HANGMAN GAME");
        System.out.println("======================================");
        System.out.println("Guess the word before the hangman is complete!");
        System.out.println("You have 6 wrong guesses.");
        System.out.println();

        // ==========================================
        // Main Game Loop
        // ==========================================

        while (wrongGuess < 6) {

            // Display current Hangman drawing
            System.out.println(getHangmanArt(wrongGuess));

            // Display current word state
            System.out.print("Word : ");

            for (char c : wordState) {
                System.out.print(c + " ");
            }

            System.out.println();
            System.out.println();

            // Take a letter from the user
            System.out.print("Guess your letter : ");
            char guess = input.next().toLowerCase().charAt(0);

            // Check whether the guessed letter exists in the word
            if (word.indexOf(guess) >= 0) {

                System.out.println("✓ Correct guess!");

                // Reveal all matching characters
                for (int i = 0; i < word.length(); i++) {

                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                // Check whether the complete word has been guessed
                if (!wordState.contains('_')) {

                    System.out.println();
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("======================================");
                    System.out.println("           🎉 YOU WON! 🎉");
                    System.out.println("======================================");
                    System.out.println("The word was : " + word);
                    break;
                }

            } else {

                // Increase wrong guess count
                wrongGuess++;

                System.out.println("✗ Wrong guess!");
            }

            System.out.println();
        }

        // ==========================================
        // Game Over
        // ==========================================

        if (wrongGuess >= 6) {

            System.out.println();
            System.out.println(getHangmanArt(wrongGuess));

            System.out.println("======================================");
            System.out.println("             GAME OVER");
            System.out.println("======================================");
            System.out.println("The word was : " + word);
        }

        // Close Scanner
        input.close();
    }

    // ==========================================
    // Hangman ASCII Art
    // ==========================================

    static String getHangmanArt(int wrongGuesses) {

        return switch (wrongGuesses) {

            case 0 -> """
                    
                    
                    
                    
                    
                    """;

            case 1 -> """
                     +---+
                     |   |
                         |
                         |
                         |
                         |
                    =========
                    """;

            case 2 -> """
                     +---+
                     |   |
                     O   |
                         |
                         |
                         |
                    =========
                    """;

            case 3 -> """
                     +---+
                     |   |
                     O   |
                     |   |
                         |
                         |
                    =========
                    """;

            case 4 -> """
                     +---+
                     |   |
                     O   |
                    /|   |
                         |
                         |
                    =========
                    """;

            case 5 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    /    |
                         |
                    =========
                    """;

            case 6 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    / \\  |
                         |
                    =========
                    """;

            default -> "";
        };
    }
}