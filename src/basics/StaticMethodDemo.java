package basics;
class CreatingMethod1{
    static void func1 ()
    {
        System.out.println("1.  its a static function");
    }
    static void func2 ()
    {
        System.out.println("2.  doesn't required any object");
    }
    static void func3()
    {
        System.out.println("3.  Called using ClassName.methodName() ");
    }
    static void func4()
    {
        System.out.println("4.  Static methods can be called from another class using the class name.");
    }
}
public class StaticMethodDemo{
    public static void main (String args[])
    {
        System.out.println("-------------------------------------");
        System.out.println("Calling functions from another class ");
        System.out.println("_____________________________________");
        CreatingMethod1.func1();
        CreatingMethod1.func2();
        CreatingMethod1.func3();
        CreatingMethod1.func4();
    }
}