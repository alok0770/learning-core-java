package mini_projects;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Quiz questions
        String[] questions = {
                "Q1. Which keyword refers to the current object?",
                "Q2. Which symbol is used for Varargs?",
                "Q3. What is the index of the first array element?",
                "Q4. What is used to initialize an object when it is created?",
                "Q5. Which keyword is used for class inheritance?"
        };

        // Options for each question
        String[][] options = {
                {"1. super", "2. this", "3. static", "4. new"},
                {"1. ..", "2. ...", "3. ::", "4. =>"},
                {"1. 0", "2. 1", "3. -1", "4. 2"},
                {"1. main()", "2. start()", "3. Constructor", "4. run()"},
                {"1. implements", "2. extends", "3. inherits", "4. super"}
        };

        // Correct answers for each question
        int[] answer = {2, 2, 1, 3, 2};

        int score = 0;
        int guess;

        // Welcome message
        System.out.println("================================");
        System.out.println("        Welcome to Java Quiz");
        System.out.println("================================");

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println();
            System.out.println(questions[i]);
            System.out.println();

            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println();

            // Take user's answer
            System.out.print("Enter your answer (1-4): ");
            guess = input.nextInt();

            System.out.println();
            System.out.println("--------------------------------");

            // Check the user's answer
            if (guess == answer[i]) {

                System.out.println("✓ Correct Answer!");
                score++;

            } else {

                System.out.println("✗ Wrong Answer");
            }

            System.out.println("--------------------------------");
        }

        // Display final score
        System.out.println();
        System.out.println("======================");
        System.out.println("Your final score : " + score);

        if (score == 5) {

            System.out.println("Congratulation you give all " + questions.length + "Question Correct 😎");

        } else if (score == 4) {

            System.out.println("Nice Game You Correct " + questions.length + " Answer");

        } else if (score == 3) {

            System.out.println("Nice Try Don't Try Again 😊");

        } else {

            System.out.println("Aap IAS Ki Tyari Chod Dijiye 🤬");
        }

        System.out.println("======================");

        input.close();
    }
}