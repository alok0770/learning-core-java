package inheritance;
   class InheritanceDemo1 {
    int mic;
    int cam;

    void fun1() {

        System.out.println("Parent function 1 Executed ");
        System.out.println("==============================");
    }

    void fun2() {
        System.out.println("");
        System.out.println("Parent Function 2 Executed ");
        System.out.println("===========================");
    }
}

    class InheritanceDemo2 extends InheritanceDemo1{
    int z;
    int x;

    void fun3()
    {
        System.out.println("");
        System.out.println("child class ");
        System.out.println("===============");
        System.out.println("Child First Function Fun3 Successfully Executed ");

    }

    }
public class SingleInheritanceDemo {
       public static void main (String args[])
       {
           InheritanceDemo2 d1 = new InheritanceDemo2();
           d1.fun1();
           d1.fun2();
           d1.fun3();
       }
}


