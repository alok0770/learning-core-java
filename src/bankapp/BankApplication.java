package bankapp;
import bank.*;
public class BankApplication {

    public static void main (String args[])
    {
        Account a1 = new Account();
        a1.setAccount("kashish ");
        a1.setBalance(10);
        a1.deposit(30);
        a1.withDraw(10);
        a1.display();
    }
}
