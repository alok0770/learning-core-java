package inheritance;


class BankAccount{


    String accountHolderName ;
    int accountHolderNumber ;

    void setAccountDetails(String Name , int Number)
    {
        accountHolderName = Name ;
        accountHolderNumber = Number ;
    }

    void displayAccountDetails()
    {
        System.out.println("=================================  ");
        System.out.println("        ACCOUNT DETAILS"            );
        System.out.println("=================================  ");
        System.out.println(" * Account Holder :-  " + accountHolderName);
        System.out.println(" * Account Number  :- " + accountHolderNumber );
        System.out.println();
    }
}

class SavingsAccount extends BankAccount {

    int balance ;
    String interestRate ;

    void setSavingsDetails (int bal , String Interest)
    {
        balance = bal ;
        interestRate = Interest ;
    }

    void displaySavingsDetails ()
    {
        System.out.println("=================================  ");
        System.out.println("        SAVING DETAILS             ");
        System.out.println("=================================  ");
        System.out.println(" * Balance :-" + balance);
        System.out.println(" * Interest Rate :- " + interestRate);
        System.out.println();

    }
}


//Grand Child Class
  public class PremiumSavings extends SavingsAccount {

    int rewardPoints ;
    String accountType ;

    void setPremiumDetails(int Points , String Type)
    {
        rewardPoints = Points ;
        accountType = Type ;
    }

    void displayPremiumDetails ()
    {
        System.out.println("=================================  ");
        System.out.println("         PREMIUM DETAILS"           );
        System.out.println("=================================  ");
        System.out.println(" * Reward Points :- " + rewardPoints);
        System.out.println(" * Account Type :- " + accountType);
        System.out.println();
    }

    void generateFinalReport()
    {
        System.out.println("=================================  ");
        System.out.println("          FINAL REPORT  "           );
        System.out.println("=================================  ");
        System.out.println(" * Account Holder :-  " + accountHolderName);
        System.out.println(" * Account Number :- " + accountHolderNumber);
        System.out.println(" * Balance :-  " + balance );
        System.out.println(" * Interest Rate :- " + interestRate);
        System.out.println(" * Reward Points :- " + rewardPoints);
        System.out.println(" * Account Type :- " + accountType);
        System.out.println();
        System.out.println(accountHolderName + " has a " + accountType + " Saving Account.");



    }
    public static void main (String args []){

        PremiumSavings p1 = new  PremiumSavings ();
        p1.setAccountDetails("Alok Rana", 836279462);
        p1.displayAccountDetails();
        p1.setSavingsDetails(300089 , "10%");
        p1.displaySavingsDetails();
        p1.setPremiumDetails(30000 , "Gold");
        p1.displayPremiumDetails();
        p1.generateFinalReport();

    }

}
