package mini_projects ;

import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {

        String item ;
        double price ;
        int quantity ;
        double total ;

        Scanner input = new Scanner (System.in);

        System.out.print("What item would you like to buy : ");
        item = input.nextLine();

        System.out.print("What is the price for each : ");
        price = input.nextDouble();

        System.out.print("How many would you like to buy : ");
        quantity = input.nextInt();

        total = price * quantity ;
        System.out.println("\nYou have bought " + quantity + " " + item + "(s)");
        System.out.printf("Your Total is : ₹%.2f%n", total);
        input.close();
    }
}
