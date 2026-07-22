package loops;


import java.util.Scanner;

public class ArithmeticProgression {
    public static void main (String args [])
    {
       Scanner Sc = new Scanner (System.in);
        System.out.println("Enter a Number");
        int num = Sc.nextInt();

// Ap = 4 7 10 13 16
        int a = 4 , d=3;

        for (int i = 1; i<=num; i++){
            System.out.println(a);
            a += d;

        }
    }
}
