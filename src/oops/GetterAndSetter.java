package oops;

public class GetterAndSetter {

    public static void main(String[] args) {

        // Creating Teacher objects
        Teacher teacher = new Teacher("Alok", 21, 101, 120000);
        Teacher teacher1 = new Teacher("Kashish", 20, 102, 70000);


        // ========================================
        //        INITIAL TEACHER DETAILS
        // ========================================

        System.out.println("========================================");
        System.out.println("        INITIAL TEACHER DETAILS");
        System.out.println("========================================");

        teacher.displayDetails();

        System.out.println("----------------------------------------");

        teacher1.displayDetails();


        // ========================================
        //        UPDATING TEACHER DETAILS
        // ========================================

        teacher.setId(0);
        teacher.setSalary(0);

        teacher1.setId(2);
        teacher1.setSalary(120000);


        // ========================================
        //         UPDATED TEACHER DETAILS
        // ========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("        UPDATED TEACHER DETAILS");
        System.out.println("========================================");

        teacher.displayUpdatedDetails();

        System.out.println("----------------------------------------");

        teacher1.displayUpdatedDetails();

        System.out.println("========================================");
    }
}


// Teacher class
class Teacher {

    // Private variables
    private String name;
    private int age;
    private int id;
    private int salary;

    // Variables to track whether setter values are valid
    private boolean idUpdated;
    private boolean salaryUpdated;


    // Constructor
    Teacher(String name, int age, int id, int salary) {

        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;

        // Initially, all values are valid
        this.idUpdated = true;
        this.salaryUpdated = true;
    }


    // ========================================
    //                 GETTERS
    // ========================================

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }


    // ========================================
    //                 SETTERS
    // ========================================

    // Setter for ID
    void setId(int id) {

        if (id <= 0) {
            idUpdated = false;
        } else {
            this.id = id;
            idUpdated = true;
        }
    }


    // Setter for salary
    void setSalary(int salary) {

        if (salary <= 0) {
            salaryUpdated = false;
        } else {
            this.salary = salary;
            salaryUpdated = true;
        }
    }


    // ========================================
    //          INITIAL DETAILS
    // ========================================

    void displayDetails() {

        System.out.println("Teacher Name   : " + getName());
        System.out.println("Teacher Age    : " + getAge());
        System.out.println("Teacher ID     : " + getId());
        System.out.println("Teacher Salary : ₹" + getSalary());
    }


    // ========================================
    //          UPDATED DETAILS
    // ========================================

    void displayUpdatedDetails() {

        System.out.println("Teacher Name   : " + getName());
        System.out.println("Teacher Age    : " + getAge());

        if (idUpdated) {
            System.out.println("Teacher ID     : " + getId());
        } else {
            System.out.println("Teacher ID     : Something went wrong!");
        }

        if (salaryUpdated) {
            System.out.println("Teacher Salary : ₹" + getSalary());
        } else {
            System.out.println("Teacher Salary : Something went wrong!");
        }
    }
}