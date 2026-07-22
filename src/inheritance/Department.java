package inheritance;
//College Management System

//Parent Class
 class College {

    String collegeName;
    String collegeLocation ;

    void setCollegeDetails (String clgName , String clgLoc)
    {
        collegeName = clgName ;
        collegeLocation = clgLoc ;
    }

    void displayCollegeDetails ()
    {
        System.out.println("=================================  ");
        System.out.println("         College Details     "      );
        System.out.println("=================================  ");
        System.out.println(" * College Name :- " + collegeName);
        System.out.println(" * College Location :- " + collegeLocation);
        System.out.println();
    }

}


// Child Class
public class Department extends College {

     String departmentName ;
     int totalStudents ;

     void setDepartmentDetails (String DepName , int Total  )
     {
         departmentName = DepName ;
         totalStudents = Total ;
     }


     void displayDepartmentDetails()
     {
         System.out.println("=================================  ");
         System.out.println("       DEPARTMENT DETAILS  "        );
         System.out.println("=================================  ");
         System.out.println();
         System.out.println(" * Department Name :- " + departmentName);
         System.out.println(" * Total Students :- " + totalStudents);
         System.out.println();
     }

     void showWelcomeMessage()
     {
         System.out.println("=================================  ");
         System.out.println(   "* Welcome to " + collegeName     );
         System.out.println(   "* Department : " + departmentName);
         System.out.println("=================================  ");
     }
     public static void main (String args[])
     {
         Department d1 = new Department();
         d1.setCollegeDetails("DIT UNIVERSITY" ,  "DEHRADUN");
         d1.displayCollegeDetails();
         d1.setDepartmentDetails("Computer Science ", 170);
         d1.displayDepartmentDetails();
         d1.showWelcomeMessage();
     }
}