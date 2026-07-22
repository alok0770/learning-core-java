package inheritance;

//Parent class
class Person1{
    String name;
     int age;

    void setPersonDetails(String name , int age )
    {
         this.name = name;
         this.age = age ;
    }
}

//Child Class
class Employee1 extends Person1{

    private String name;
    private String department ;

    void setEmployeeDetails(String name , String department)
    {
        this.name = name ;
        this.department  = department ;

    }

    void displayDetails ()
    {

        System.out.println("==================================");
        System.out.println("         PERSON DETAILS           ");
        System.out.println("==================================");
        System.out.println(" * Person Name :- " + super.name);
        System.out.println(" * Age :- " + super.age);
        System.out.println();
        System.out.println("==================================");
        System.out.println("        EMPLOYEE DETAILS          ");
        System.out.println("==================================");
        System.out.println(" * Employee Name :- "  + this . name);
        System.out.println(" Department :- " + this.department);
        System.out.println();

    }
}



public class Print {
    public static void main (String args[]){
        {
            Employee1 e1 = new Employee1();
            e1.setPersonDetails(" Alok Rana " , 20);
            e1.setEmployeeDetails(" Alok " , " I.T ");
            e1.displayDetails();

        }

    }
}
