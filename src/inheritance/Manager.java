package inheritance;

// Parent Class
class Employee {

    String employeeName;
    int employeeId;

    void setEmployeeDetails(String name, int id) {
        employeeName = name;
        employeeId = id;
    }

    void displayEmployeeDetails() {
        System.out.println("========================================");
        System.out.println("          EMPLOYEE DETAILS");
        System.out.println("========================================");
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID   : " + employeeId);
    }
}

// Child Class
public class Manager extends Employee {

    String department;
    int salary;

    void setManagerDetails(String dept, int sal) {
        department = dept;
        salary = sal;
    }

    void displayManagerDetails() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("          MANAGER DETAILS");
        System.out.println("========================================");
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
    }

    void showCompanyMessage() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("Welcome " + employeeName + " to our Company");
        System.out.println("========================================");
    }

    public static void main(String[] args) {

        Manager m1 = new Manager();

        // Parent Details
        m1.setEmployeeDetails("Alok", 5234);

        // Child Details
        m1.setManagerDetails("Software", 80000);

        // Display
        m1.displayEmployeeDetails();
        m1.displayManagerDetails();
        m1.showCompanyMessage();
    }
}