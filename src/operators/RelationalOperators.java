package operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // Displaying the program title
        System.out.println("=================================");
        System.out.println("      Relational Operators       ");
        System.out.println("=================================");
        System.out.println();

        // Initial values
        int firstNum = 50;
        int secondNum = 25;

        // Displaying the result of each relational operator
        System.out.println("firstNum > secondNum  : " + (firstNum > secondNum));
        System.out.println("firstNum < secondNum  : " + (firstNum < secondNum));
        System.out.println("firstNum >= secondNum : " + (firstNum >= secondNum));
        System.out.println("firstNum <= secondNum : " + (firstNum <= secondNum));
        System.out.println("firstNum == secondNum : " + (firstNum == secondNum));
        System.out.println("firstNum != secondNum : " + (firstNum != secondNum));
    }
}
