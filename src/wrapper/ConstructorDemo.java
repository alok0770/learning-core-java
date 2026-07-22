package wrapper;
class Demo10{

    int salary ;
    int marks ;
    String age ;

    Demo10(int p , int q , String r )
    {
        salary = p ;
        marks = q ;
        age = r ;
    }
    Demo10(int x , int y)
    {
        salary = x ;
        marks = y ;
    }

    void fun1()
    {
        System.out.println("Salary :- " + salary);
        System.out.println("Marks :- " + marks );
        System.out.println("Age :- " + age);
    }
    void fun2()
    {
        System.out.println("Salary :- " + salary);
        System.out.println("Marks :- " + marks );
    }
}
public class ConstructorDemo {
    public static void main (String args[])
    {
        Demo10 d1 = new Demo10(12332,54,"28");
        Demo10 d2 = new Demo10(25243,54);
        d1.fun1();
        System.out.println("===================");
        d2.fun2();
    }
}
