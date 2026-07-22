package inheritance;

class Person{// parent class

        String name ;
        int age ;

        void setPersonalDetails(String  p, int q)
        {
            name = p ;
            age = q ;
        }

        void displayPersonalDetails()
        {
            System.out.println("===========================");
            System.out.println("      PERSONAL DETAILS"     );
            System.out.println("===========================");
            System.out.println(" Student Name  :- " + name);
            System.out.println(" Student Age   :- " + age  );
        }
}

public class Student extends Person{

    String course ;
    int marks ;

    void setStudentDetails ( String x, int y )
    {
        course = x ;
        marks = y ;
    }

    void displayStudentDetails()
    {
        System.out.println("=====================");
        System.out.println("   STUDENT DETAILS   ");
        System.out.println("=====================");
        System.out.println("Course :- " + course);
        System.out.println("Marks  :- " + marks);
    }


    public static void main(String args []){

        Student s1 = new Student ();
        s1.setPersonalDetails("Alok", 20);
        s1.displayPersonalDetails();
        s1.setStudentDetails("B.C.A", 95);
        s1.displayStudentDetails();

    }
}
