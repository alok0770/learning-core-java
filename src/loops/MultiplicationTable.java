package loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String args [])
    {
//        //Printing the table of 19...
//        for ( int i = 1;  i<=10; i++){
//            System.out.println("19 x " + i + " = " + i*19);
//        }

        // Print the table of n Here n is a integer which user will input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number ");
        int num = sc.nextInt();

        for ( int i= 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);



        }
    }
}
