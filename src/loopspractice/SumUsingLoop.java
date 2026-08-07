package loopspractice;

import java.util.Scanner;

public class SumUsingLoop {
    static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Number 1 :- " );
        int x = sc.nextInt();
        System.out.print("Enter Number 2 :- " );
        int y = sc.nextInt();
        for (int i = x ; i <=y ; i++) {
            System.out.println(" Numbers :- " + i);

        }
    }
}


