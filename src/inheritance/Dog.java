package inheritance;

class Animal {

    String animalName  ;
    int animalAge ;

    void setAnimalDetails(String p , int q)
    {
        animalName = p ;
        animalAge = q ;
    }

    void displayAnimalDetails()
    {
        System.out.println("================================");
        System.out.println("       Animal Details           ");
        System.out.println("================================");
        System.out.println("1. Animal Name :-  " + animalName);
        System.out.println("2. Animal Age  :-  " + animalAge);
        System.out.println("================================");
    }
}





public class Dog extends Animal{

    String animalLocation ;

    void setDogDetails( String x)
    {
        animalLocation = x;
    }

    void displayDogDetails()
    {
        System.out.println("=======================");
        System.out.println("      Dog Details"      );
        System.out.println("=======================");

        System.out.println("Animal Location " + animalLocation);
        System.out.println("========================");
    }


    public static void main (String args[] ){

        Dog d1 = new Dog ();
        d1.setAnimalDetails("Lion" , 43);
        d1.displayAnimalDetails();
        d1.setDogDetails(" Forest ");
        d1.displayDogDetails();


    }
}

