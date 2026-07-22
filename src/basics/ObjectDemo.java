package basics;
class UsingObjectDemo {

        String name =  "Alok";
        int salary = 20;
        void func()
        {
            System.out.println("====================================");
            System.out.println("         OBJECT DEMO");
            System.out.println("====================================");
        }

    void func1()
    {
        System.out.println("1..  This is non-static function");
        System.out.println("");
    }
    void func2()
    {
        System.out.println("2..  Non-Static Function only called by creating Object");
        System.out.println("");
    }
    void func3()
    {
        System.out.println("3..  Using Object Refrence to call any Functio From Another Class");
        System.out.println("");
    }
}
public class ObjectDemo{
    public static void main (String args[])
    {
        UsingObjectDemo m1 = new UsingObjectDemo();
        m1.func();
        m1.func1();
        m1.func2();
        m1.func3();
        System.out.println("==================");
        System.out.println("Name :- " + m1.name);
        System.out.println("==================");
    }
}
