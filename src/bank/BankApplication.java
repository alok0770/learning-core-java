package bank;

import java.util.Scanner;

public class BankApplication {

    public static void main (String [] args)
    {

        // Using Scaner for Input holder name and Balance
        Scanner sc = new Scanner (System.in);
        System.out.print("* Enter AccountHolder Name :  ");
        String accountHolder = sc.nextLine();

        System.out.print("* Enter Account Balance : ");
        double balance = sc.nextDouble();
        System.out.println();


        // Creating user account and balance
        Account a1 = new Account ( accountHolder  ,  balance);
        a1.getAccountHolder();
        a1.display();
        System.out.println();
        System.out.println("* Welcome : " + a1.getAccountHolder());
        System.out.println("------------------------");
        System.out.println();

        //While Loop is running

        boolean isRunning = true;
        while( isRunning ) {

            // printing bank menu

            System.out.println("=========== BANK MENU ========== ");
            System.out.println("1.          Deposit              ");
            System.out.println("2.          Withdraw             ");
            System.out.println("3.          Display Balance      ");
            System.out.println("4.          Exit                 ");
            System.out.println("=================================");
            System.out.println();

            // Taking user Choice
            System.out.print("* User :-  Please enter your choice : " );
            int choice = sc.nextInt ();
            System.out.println();
            System.out.println("* Your Choice : " + choice);
            System.out.println();

            switch (choice){
                case 1 :
                    System.out.println("====================");
                    System.out.print("Enter Your Amount : ");
                    int amount = sc.nextInt();

                    a1.deposit(amount);
                    System.out.println();
                    System.out.println("* [Congratulations]  \u20B9 " + amount + " credited successfully.");
                    System.out.println();
                    System.out.println("-----------------------------------------");
                    System.out.println("* Your Current Balance : " + a1.getBalance());
                    System.out.println("-----------------------------------------");
                    System.out.println();

                    break ;

                case 2 :
                    System.out.println("====================");
                    System.out.print("Enter Your Amount : ");
                    int rupees = sc.nextInt();

                    a1.withdraw(rupees);

                    System.out.println();
                    System.out.println("* Your amount " + rupees + " debited  ");
                    System.out.println();
                    System.out.println("-----------------------------------------");
                    System.out.println("* Your Current Balance : " + a1.getBalance());
                    System.out.println("-----------------------------------------");
                    break ;

                case 3 :
                    System.out.println("----------------------------------");
                    System.out.println( "* Your Balance : " + a1.getBalance());
                    System.out.println("----------------------------------");
                    System.out.println();
                    break;

                case 4 :
                    isRunning = false ;
                    System.out.println(":- Thank you for using our Bank Application : ");

                    break ;

                default:
                    System.out.println();
                    System.out.println("* Invalid Choice : Please Enter A valid Choice : ");
                    System.out.println();
                        }

                    }
        }



        }



