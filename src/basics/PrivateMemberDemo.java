package basics;
class A{
    int x;
    private static int y;
    void fun1()
    {
        y=22;
        x=56;
        System.out.println(" fun1 executed ");
    }
    void fun2()
    {
        System.out.println("value of y -: " + y);
        System.out.println( "value of x -: " + x);
        System.out.println(" func2 executed ");
    }
    void fun3()
    {
        y=45;
        System.out.println(" fun3 executed ");
    }
}

public class PrivateMemberDemo {
    public static void main(String arsgs[])
    {
        A a1 =new A();
        A a2 = new A();
        a1.fun1();
        a1.fun3();
        a2.fun2();
        a2.fun1();
        a2.fun3();
    }
}
