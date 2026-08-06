package strings;

public class StringMethodsBasics {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("       STRING METHODS");
        System.out.println("==============================");
        System.out.println();

        // Creating sample strings
        String name = "    Alok Rana     ";
        String email = "alokrana72327@gmail.com";

        String username;
        String domain;

        // Returns the total number of characters in the string
        int length = name.length();
        System.out.println("Total Characters : " + length);

        // Returns the character at the specified index
        char letter = name.charAt(6);
        System.out.println("Character at Index 6 : " + letter);

        // Returns the first occurrence of a character
        int firstIndex = name.indexOf("R");
        System.out.println("First Index of 'R' : " + firstIndex);

        // Returns the last occurrence of a character
        int lastIndex = name.lastIndexOf("a");
        System.out.println("Last Index of 'a' : " + lastIndex);

        // Converts all characters to uppercase
        name = name.toUpperCase();
        System.out.println("Uppercase : " + name);

        // Converts all characters to lowercase
        name = name.toLowerCase();
        System.out.println("Lowercase : " + name);

        // Removes leading and trailing spaces
        name = name.trim();
        System.out.println("Trimmed : " + name);

        // Replaces all occurrences of 'a' with 'O'
        name = name.replace("a", "O");
        System.out.println("After Replace : " + name);

        // Checks whether the string is empty
        System.out.println("Is Empty? : " + name.isEmpty());

        // Checks whether the string contains a specific character or word
        System.out.println("Contains Space? : " + name.contains(" "));

        // Compares two strings (case-sensitive)
        System.out.println("Equals \"Alok Rana\"? : " + name.equals("Alok Rana"));

        // Compares two strings (ignores uppercase and lowercase)
        System.out.println("Equals Ignore Case? : " + name.equalsIgnoreCase("ALOK RANA"));

        // Extracts the username from the email
        username = email.substring(0, email.indexOf("@"));
        System.out.println("Username : " + username);

        // Extracts the domain from the email
        domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Domain : " + domain);
    }
}