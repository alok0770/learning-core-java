package inheritance;

//Parent Class
class Hospital {

    String hospitalName ;
    String hospitalCity ;

    void setHospitalDetails(String Name , String City )
    {
        hospitalName = Name ;
        hospitalCity = City ;
    }

    void displayHospitalDetails()
    {
        System.out.println("==================================");
        System.out.println("        HOSPITAL DETAILS"          );
        System.out.println("==================================");
        System.out.println("* Hospital Name :- " + hospitalName);
        System.out.println("* Hospital City :- " + hospitalCity);
        System.out.println();
    }

}

//Parent Class
public class Doctor extends Hospital {

    String doctorName ;
    String doctorSpecialization ;

    void setDoctorDetails(String DocName , String DocSpe)
    {
        doctorName = DocName ;
        doctorSpecialization = DocSpe ;

    }

    void displayDoctorDetails ()
    {
        System.out.println("==================================");
        System.out.println("          Doctor Details          ");
        System.out.println("==================================");
        System.out.println(   "* Doctor Name :- " + doctorName    );
        System.out.println(   "* Doctor Specialization :- " + doctorSpecialization);
        System.out.println();
    }


    void generateReport ()
    {
        System.out.println("==================================");
        System.out.println("          FINAL REPORT"            );
        System.out.println("==================================");
        System.out.println(" Hospital :- " + hospitalName);
        System.out.println(" City :- " + hospitalCity);
        System.out.println(" Doctor :- " + doctorName);
        System.out.println(" Specialization :- " + doctorSpecialization);
        System.out.println(" Doctor :- " + doctorName + " is Working in " +hospitalName + " Hospital" );

    }

    public static void main (String args [])
    {
        Doctor d1 = new Doctor();
        d1.setHospitalDetails("AIIMS" , "Delhi");
        d1.displayHospitalDetails();
        d1.setDoctorDetails("Alok Rana " , "Physician" );
        d1.displayDoctorDetails();
        d1.generateReport();
    }
}


