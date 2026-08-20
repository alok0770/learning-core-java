package wrapper;

public class WrapperClasses {

    public static void main(String[] args) {

        // ============================
        // Autoboxing
        // Primitive → Wrapper Object
        // ============================

        Integer number = 123;
        Double decimalNumber = 32.15;
        Character letter = 'A';
        Boolean status = true;

        // ============================
        // Auto-Unboxing
        // Wrapper Object → Primitive
        // ============================

        int primitiveInt = number;
        double primitiveDouble = decimalNumber;
        char primitiveChar = letter;
        boolean primitiveBoolean = status;

        // ============================
        // Wrapper Class Methods
        // ============================

        // parseInt() converts a String into primitive int
        int parsedInt = Integer.parseInt("764");

        // parseDouble() converts a String into primitive double
        double parsedDouble = Double.parseDouble("34.56");

        // Character methods
        char character = 'A';

        boolean isLetter = Character.isLetter(character);
        boolean isUpperCase = Character.isUpperCase(character);

        // ============================
        // Output
        // ============================

        System.out.println("========== WRAPPER CLASSES ==========");

        System.out.println("\n--- Autoboxing ---");
        System.out.println("Integer Object    : " + number);
        System.out.println("Double Object     : " + decimalNumber);
        System.out.println("Character Object  : " + letter);
        System.out.println("Boolean Object    : " + status);

        System.out.println("\n--- Auto-Unboxing ---");
        System.out.println("Primitive int     : " + primitiveInt);
        System.out.println("Primitive double  : " + primitiveDouble);
        System.out.println("Primitive char    : " + primitiveChar);
        System.out.println("Primitive boolean : " + primitiveBoolean);

        System.out.println("\n--- Parsing Methods ---");
        System.out.println("Parsed int        : " + parsedInt);
        System.out.println("Parsed double     : " + parsedDouble);

        System.out.println("\n--- Character Methods ---");
        System.out.println("Character         : " + character);
        System.out.println("Is Letter?        : " + isLetter);
        System.out.println("Is Uppercase?     : " + isUpperCase);

        System.out.println("======================================");
    }
}