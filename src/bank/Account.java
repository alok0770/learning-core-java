package bank;

public class Account {

    // Encapsulation
    private final String accountHolder;
    private double balance;


    // Parameterized Constructor
   Account(  String accountHolder , double balance)
  {
      this.accountHolder = accountHolder ;
      this.balance = balance ;

  }

   public  String  getAccountHolder(){

      return accountHolder ;

  }

   public double getBalance (){
      return balance ;
  }


     void deposit(int deposit) {
      if (deposit <=0 ) {
          System.out.println("Invalid deposit amount ");
      }else{
         balance = balance + deposit ;

        }
    }

     void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
        }
    }

    public void display() {
        System.out.println("===========================");
        System.out.println("        BANK ACCOUNT       ");
        System.out.println("===========================");

        System.out.println();
        System.out.println("1. Account Holder : " + accountHolder);
        System.out.println("2. Current Balance :  \u20B9 " + balance);
        System.out.println();

    }
}
