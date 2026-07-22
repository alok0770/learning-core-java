package wrapper;
 class Demo1 {
    int salary;
    int marks;
    String age;

    Demo1(int s , int m, String a)
    {
         salary = s;
         marks = m;
        age = a;
    }


     void fun2()
     {
         System.out.println("salary :- " + salary);
         System.out.println("Student Marks :- " + marks);
         System.out.println( "Age :- " + age);
     }

}
public class ParameterizedConstructorDemo {
    public static void main (String args[])
    {
        Demo1 d1 = new Demo1(3000, 45 ,"32");
        Demo1 d2 = new Demo1 (64535, 45 , "43");
        d1.fun2();
        System.out.println("============================");
        d2.fun2();
    }
}