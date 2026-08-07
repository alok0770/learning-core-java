package conditionals;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";

             while(name.trim().isEmpty()) {
                System.out.print("Enter Your Name : " );
                name = input.nextLine().trim();
            }

            System.out.println("Hello "+ name);

        input.close();
    }
}