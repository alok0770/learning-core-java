package oops;

public class ConstructorOverloading {

    public static void main(String[] args) {

        // Constructor 1: Only username
        User user1 = new User("alok.xox");

        System.out.println("================================");
        System.out.println("         USER 1 DETAILS");
        System.out.println("================================");
        System.out.println("Username : " + user1.username);
        System.out.println("Email    : " + user1.email);
        System.out.println("Age      : " + user1.age);
        System.out.println("Place    : " + user1.place);


        // Constructor 2: Username and email
        User user2 = new User(
                "sumit.123",
                "sumit4356@gmail.com"
        );

        System.out.println("\n--------------------------------");
        System.out.println("         USER 2 DETAILS");
        System.out.println("--------------------------------");
        System.out.println("Username : " + user2.username);
        System.out.println("Email    : " + user2.email);
        System.out.println("Age      : " + user2.age);
        System.out.println("Place    : " + user2.place);


        // Constructor 3: Email, age and place
        // Username is automatically set to "Guest"
        User user3 = new User(
                "karlos456@gmail.com",
                23,
                "Uttarkashi"
        );

        System.out.println("\n--------------------------------");
        System.out.println("         USER 3 DETAILS");
        System.out.println("--------------------------------");
        System.out.println("Username : " + user3.username);
        System.out.println("Email    : " + user3.email);
        System.out.println("Age      : " + user3.age);
        System.out.println("Place    : " + user3.place);

        System.out.println("================================");
    }
}


// User class
class User {

    // Instance variables
    String username;
    String email;
    int age;
    String place;


    // Constructor 1
    // Initializes only the username.
    User(String username) {

        this.username = username;
        this.age = 0;
        this.email = "Null";
        this.place = "Null";
    }


    // Constructor 2
    // Initializes username and email.
    User(String username, String email) {

        this.username = username;
        this.email = email;
        this.age = 0;
        this.place = "Null";
    }


    // Constructor 3
    // Username is not provided, so it is set to "Guest".
    User(String email, int age, String place) {

        this.username = "Guest";
        this.email = email;
        this.age = age;
        this.place = place;
    }
}