package practice;

public class PrintfBasics {

    public static void main(String[] args) {

        // printf() = Formats and displays output
        // %[flags][width][.precision]specifier

        System.out.println("====================================");
        System.out.println("          PRINTF BASICS             ");
        System.out.println("====================================");
        System.out.println();

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        double price = 12.343;

        // ==============================
        // Specifier Characters
        // ==============================

        System.out.printf("Hello %s%n", name);
        System.out.printf("First Letter : %c%n", firstLetter);
        System.out.printf("Age : %d years%n", age);
        System.out.printf("Height : %.1f cm%n", height);
        System.out.printf("Employed : %b%n", isEmployed);

        System.out.printf("%n%s is %d years old.%n", name, age);

        // ==============================
        // Precision
        // ==============================

        System.out.println();
        System.out.println("----- Precision -----");

        System.out.printf("Height : %.1f cm%n", height);
        System.out.printf("Price : %.2f%n", price);

        // ==============================
        // Flags
        // ==============================

        System.out.println();
        System.out.println("----- Flags -----");

        // Left align
        System.out.printf("%-15s : %d%n", name, age);

        // Always show sign
        System.out.printf("%+d%n", age);

        // Add leading zeros
        System.out.printf("%05d%n", age);

        // Add commas to large numbers
        System.out.printf("%,d%n", 1000000);

        // ==============================
        // Width
        // ==============================

        System.out.println();
        System.out.println("----- Width -----");

        System.out.printf("%10s%n", name);
        System.out.printf("%10d%n", age);
        System.out.printf("%10.2f%n", price);
    }
}