package wrapper;

import java.util.Scanner;

class Demo1 {
    String name;
    int age ;
    int marks;
    String subject ;

    Demo1( String name , int age , int marks, String subject)
    {
        this.name = name ;
        this.age = age ;
        this.marks = marks;
        this.subject = subject ;



    }


    void displayStudentDetails()
    {
        System.out.println("       STUDENT DETAILS "       );
        System.out.println("==============================");
        System.out.println(" Student Name :- " + name );
        System.out.println(" Student Age :- " + age );
        System.out.println(" Student Marks :- " + marks + (marks < 50 ? " FAIL" : " -> PASS"));
        System.out.println(" Student Subject :- " +subject);
        System.out.println("================================");

    }
}
public class ParameterizedConstructorDemo {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = input.nextLine().toUpperCase();


        System.out.print("Enter your age : ");
        int age = input.nextInt();

        System.out.print("Enter your marks : ");
        int marks = input.nextInt();
        input.nextLine();


        System.out.print("Enter your subject : ");
        String sub = input.nextLine().toUpperCase();

        Demo1 demo1 = new Demo1(name , age , marks , sub);

        System.out.println();
        demo1.displayStudentDetails();


    }
}