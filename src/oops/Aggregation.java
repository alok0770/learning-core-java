package oops;

public class Aggregation {

    public static void main(String[] args) {

        // ========================================
        //          CREATING BOOK OBJECTS
        // ========================================

        Book book1 = new Book("Clean Code", 464);
        Book book2 = new Book("Effective Java", 416);
        Book book3 = new Book("Atomic Habits", 320);


        // Creating an array of Book objects
        Book[] books = {book1, book2, book3};


        // ========================================
        //          CREATING LIBRARY OBJECT
        // ========================================

        // Library has a reference to the Book[] array.
        // This represents a HAS-A relationship (Aggregation).
        Library library = new Library(
                "Dehradun Central Library",
                1998,
                books
        );


        // Display library and available book details
        library.displayInfo();
    }
}


// ========================================
//              BOOK CLASS
// ========================================

class Book {

    String title;
    int pages;


    // Constructor
    Book(String title, int pages) {

        this.title = title;
        this.pages = pages;
    }


    // Displays details of a single book
    void displayInfo() {

        System.out.println("Book Title : " + this.title);
        System.out.println("Book Pages : " + this.pages);
        System.out.println("-------------------------");
    }
}


// ========================================
//             LIBRARY CLASS
// ========================================

class Library {

    String name;
    int year;

    // Library HAS-A Book[]
    // This is the aggregation relationship.
    Book[] books;


    // Constructor
    Library(String name, int year, Book[] books) {

        this.name = name;
        this.year = year;
        this.books = books;
    }


    // Displays library information
    // and details of all available books
    void displayInfo() {

        // Library information
        System.out.println("========================================");
        System.out.println("             LIBRARY DETAILS");
        System.out.println("========================================");

        System.out.println("Library Name : " + this.name);
        System.out.println("Established  : " + this.year);


        // Book information
        System.out.println();
        System.out.println("========================================");
        System.out.println("             BOOK DETAILS");
        System.out.println("========================================");


        // Loop through the Book array
        // and display each Book object
        for (Book book : books) {

            book.displayInfo();
        }

        System.out.println("========================================");
    }
}