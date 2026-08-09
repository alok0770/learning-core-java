package conditionals;

import java.util.Scanner;

public class WhileLoopBasic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter Your Age : ");
        age = input.nextInt();

        // Keep asking until a valid age is entered
        while (age <= 0) {

            System.out.println("[Error] Please Enter a Valid Age.");
            System.out.print("Enter Your Age : ");
            age = input.nextInt();
        }

        System.out.println("-----------------------");
        System.out.println("Your Age Is : " + age);
        System.out.println("-----------------------");

        input.close();
    }
}