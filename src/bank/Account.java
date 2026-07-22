package bank;
public class Account {

    private String accountHolder;
    private int balance;

    public void setAccount(String p) {
        accountHolder = p;
    }

    public void setBalance(int s)
    {
        balance=s;
    }

    public void deposit(int q) {
        balance = balance + q;
    }

    public void withDraw(int r) {
        balance = balance - r;
    }

    public void display() {
        System.out.println("================");
        System.out.println("BANK ACCOUNT");
        System.out.println("================");


        System.out.println("1.. Account Holder = " + accountHolder);
        System.out.println("2.. Current Balance = \u20B9 " + balance);
        System.out.println("========================================");
    }
}
