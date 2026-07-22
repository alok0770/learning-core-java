package wrapper;
// Command Line Argument with wrapper class object Integer parseInt

// Q1...
// Take two numbers using Command Line Arguments.
// Convert both into int using Integer.parseInt().
// Print their sum.
//
// Example Program Arguments:
// 10 20
//
// Expected Output:
// Sum = 30


//public class CommandLineArgument{
//    public static void main(String args[])
//    {
//        int firstNumber = Integer.parseInt(args[0]);
//        int secondNumber = Integer.parseInt(args[1]);
//
//        System.out.println(firstNumber+secondNumber);
//    }
//}


// Q2...
// Take three numbers using Command Line Arguments.
// Convert all three into int using Integer.parseInt().
// Find their average.
// Print the answer in proper format.
//
// Example Program Arguments:
// 10 20 30
//
// Expected Output:
// ==========================
//      AVERAGE PROGRAM
// ==========================
public class CommandLineArgument{
    public static void main (String args[])
    {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        System.out.println("          ===================");
        System.out.println("            Average Program         ");
        System.out.println("          ===================");

        System.out.println("");

        System.out.println("1...   Average :- " + (firstNumber+secondNumber+thirdNumber)/3);
    }
}