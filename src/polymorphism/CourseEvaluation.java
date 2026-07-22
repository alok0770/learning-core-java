package polymorphism;

// Parent Class
class Course {

    String courseName;
    String courseCode;

    void setCourseDetails(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void displayCourseDetails() {

        System.out.println("====================================");
        System.out.println("          COURSE DETAILS");
        System.out.println("====================================");
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Code : " + courseCode);
        System.out.println();
    }
}

// Child Class
public class CourseEvaluation extends Course {

    int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }

    // Common Method (No Duplicate Code)
    void printGrade(int finalMarks) {

        if (finalMarks >= 90)
            System.out.println("Grade : A+");

        else if (finalMarks >= 75)
            System.out.println("Grade : A");

        else if (finalMarks >= 60)
            System.out.println("Grade : B");

        else if (finalMarks >= 40)
            System.out.println("Grade : C");

        else
            System.out.println("Result : Fail");
    }

    // Method Overloading (Without Grace)
    void calculateResult() {

        System.out.println("===== RESULT =====");
        printGrade(this.marks);
        System.out.println();
    }

    // Method Overloading (With Grace)
    void calculateResult(int graceMarks) {

        int totalMarks = this.marks + graceMarks;

        System.out.println("===== RESULT WITH GRACE =====");
        System.out.println("Original Marks : " + this.marks);
        System.out.println("Grace Marks    : " + graceMarks);
        System.out.println("Total Marks    : " + totalMarks);

        printGrade(totalMarks);

        System.out.println();
    }

    void displayReport() {

        System.out.println("====================================");
        System.out.println("          COURSE REPORT");
        System.out.println("====================================");
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Code : " + courseCode);
        System.out.println("Marks       : " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        CourseEvaluation c1 = new CourseEvaluation();

        c1.setCourseDetails("Java Programming", "CS201");
        c1.setMarks(82);

        c1.displayCourseDetails();
        c1.displayReport();

        c1.calculateResult();      // Without Grace
        c1.calculateResult(8);     // With Grace
    }
}