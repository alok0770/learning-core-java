package packagesclient;
import packages.*;

public class PackageUsageDemo {
    public static void main (String args[])
    {
        PackageDemo p1 = new PackageDemo();

        p1.setData(100,200);
        System.out.println("=====================");
        System.out.println("First object");
        System.out.println("=====================");
        p1.display();



        PackageDemo p2 = new PackageDemo();

        p2.setData (23 ,56);
        System.out.println("=====================");
        System.out.println("Second Object");
        System.out.println("=====================");
        p2.display ();
        System.out.println("=====================");

    }
}