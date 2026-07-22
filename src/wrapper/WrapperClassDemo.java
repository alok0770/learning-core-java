package wrapper;
//Q1... String "50" ko int me convert karke print karo.
//public class Wrapper{
//    public static void main (String args[]) {
//        String age = "50";
//        int x = Integer.parseInt(age);
//        System.out.println(x);
//    }
//}

// Q2...
// Create a String variable named number and store "100" in it.
// Convert the String into int using Integer.parseInt().
// Add 50 to it and print the result.

// Expected Output:
// 150

//public class Wrapper{
//    public static void main (String args[])
//    {
//        String number = "100";
//        int y = Integer.parseInt(number);
//        System.out.println(y+50);
//    }
//}

// Q3...
// Create a String variable named age and store "25" in it.
// Convert it into int using Integer.parseInt().
// Print the value.
//
// Expected Output:
// 25
//System.out.println(Integer.parseInt(number) + 50);


// Q4...
// Create two String variables:
//
// String a = "20";
// String b = "30";
//
// Convert both into int using Integer.parseInt().
// Find their sum and print it.
//
// Expected Output:
// 50

//public class Wrapper{
//    public static void main(String args[])
//    {
//        String x = "20";
//        String y = "30";
//        int a = Integer.parseInt(x);
//        int b = Integer.parseInt(y);
//        System.out.println(a+b);
//    }
//}


// Q5...
// Create a String variable named salary and store "50000" in it.
// Convert it into int using Integer.parseInt().
// Add a bonus of 5000.
// Print the final salary.
//
// Expected Output:
// 55000

//public class Wrapper{
//    public static void main (String args[])
//    {
//        String salary = "50000";
//        int convert = Integer.parseInt(salary);
//
//        String bonus = "5000";
//        int finalSalary= Integer.parseInt(bonus);
//
//        System.out.println(convert+finalSalary);
//
//    }
//}

// Q6...
// Create a String variable named marks and store "85" in it.
// Convert it into int using Integer.parseInt().
// Add 5 grace marks.
// Print the final marks.
//
// Expected Output:
// 90


//public class Wrapper{
//    public static void main (String args [])
//    {
//        String Marks = "85";
//        int studentMarks = Integer.parseInt(Marks);
//
//        int gracemarks = 5;
//
//        System.out.println(studentMarks+gracemarks);
//    }
//}


// Q7...
// Create two String variables:
//
// String x = "10";
// String y = "5";
//
// Convert both into int using Integer.parseInt().
//
// Print:
//
// Addition = 15
// Subtraction = 5
// Multiplication = 50
// Division = 2
//
// Expected Output:
//
// Addition = 15
// Subtraction = 5
// Multiplication = 50
// Division = 2

//public class Wrapper{
//    public static void main(String args[])
//    {
//       String x = "10";
//       String y = "5";
//
//       int a = Integer.parseInt(x);
//       int b = Integer.parseInt(y);
//
//        System.out.println("===========");
//        System.out.println("CALCULATOR");
//        System.out.println("===========");
//
//        System.out.println(" 1. Addition = " + (a+b));
//        System.out.println("2. Subtraction = "+ (a-b));
//        System.out.println("3. Multiplication = " + (a*b));
//        System.out.println("4. Division = "+ (a/b));
//    }
//}



// Q8...
// Create a String variable named num and store "100" in it.
//
// First print:
// System.out.println(num + 50);
//
// Then convert num into int using Integer.parseInt().
// Print the result after adding 50.
//
// Finally, write a one-line comment explaining
// why both outputs are different.


public class WrapperClassDemo {
    public static void main (String args[])
    {
        String num = "100";
        System.out.println(num+50);

        int firstNum = Integer.parseInt(num);
        System.out.println( 50+firstNum );

        // The first output is concatenated because 'num' is a String.
// The second output is added because 'num' is converted into int using Integer.parseInt().
    }
}


// Finish The topic Integer.parse.Int (wrapper Class)





