package mini_projects;


import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        String word = "pizza";

        Scanner input = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i <word.length() ; i++) {
            wordState.add('_');
        }

        System.out.println("=============================");
        System.out.println("Welcome to java hangman Game ");
        System.out.println("=============================");
        System.out.println();

       while(wrongGuess < 6){

           System.out.println(getHangmanArt(wrongGuess));

           System.out.print("word : ");

           for(char c : wordState){
               System.out.print(c + " ");
           }
           System.out.println();

           System.out.print("Guess your letter : ");
           char guess  = input.next().toLowerCase().charAt(0);

           if(word.indexOf(guess) >= 0){
               System.out.println("Correct guess !!");

               for (int i = 0; i <word.length() ; i++) {
                   if(word.charAt(i) == guess){
                       wordState.set(i, guess);
                   }
               }
               if(!wordState.contains('_')){
                   System.out.println(getHangmanArt(wrongGuess));
                   System.out.println("You Won ");
                   System.out.println("The word is :"+word);
                   break;
               }
           }
           else {
               wrongGuess++;

               System.out.println("Wrong guess !!");
           }
       }

       if(wrongGuess >= 6){
           System.out.println(getHangmanArt(wrongGuess));
           System.out.println("Game Over !!");
           System.out.println("The Word is : "+word);
       }

        input.close();
    }

    static String getHangmanArt(int wrongGuesses)
    {

        return switch(wrongGuesses){

            case 0 -> """
                    
                    
                      """ ;

            case 1 -> """
                     +---+
                       |
                       
                        
                      """;
            case 2 -> """
                     +---+
                       |
                       o
                        
                      """;

            case 3 -> """
                     +---+
                       |
                       o
                      /| 
                      """;

            case 4 -> """
                     +---+
                       |
                       o
                      /|\\ 
                      """;

            case 5 -> """
                     +---+
                       |
                       o
                      /|\\ 
                      /
                      """;

            case 6 -> """
                     +---+
                       |
                       o
                      /|\\ 
                      / \\
                      """;

            default -> " " ;
        };
    }
}

