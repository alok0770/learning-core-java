package  madlibsgame;

import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args) {

        System.out.println("==========================");
        System.out.println("      Game Start.         ");
        System.out.println("==========================");
        System.out.println();

        System.out.println();
        System.out.println("Today I saw a ________ (adjective1) ________ (noun).");
        System.out.println("It was so ________ (adjective2) that it started to ________ (verb1)");
        System.out.println("in the middle of the road.");
        System.out.println("Everyone looked at it and said,");
        System.out.println("\"Wow! That's the most ________ (adjective3) thing I've ever seen!\"");
        System.out.println();

        String adjective1 ;
        String noun ;
        String adjective2 ;
        String verb1 ;
        String adjective3 ;

        Scanner input = new Scanner (System.in);


        System.out.print("* Enter an Adjective1 : ");
        adjective1 = input.nextLine();

        System.out.print("* Enter a Noun : ");
        noun = input.nextLine();

        System.out.print("* Enter an Adjective2 : ");
        adjective2 = input.nextLine();

        System.out.print("* Enter a verb1 : ");
        verb1 = input.nextLine();

        System.out.print("* Enter a Adjective3 : ");
        adjective3 = input.nextLine();


        System.out.println();
        System.out.println("Today I saw a " + adjective1 + " " + noun + ".");
        System.out.println("It was so " + adjective2 + " that it started to " + verb1);
        System.out.println("in the middle of the road.");
        System.out.println("Everyone looked at it and said,");
        System.out.println("\"Wow! That's the most " + (adjective3) + " thing I've ever seen!\"");

        input.close();
    }
}
