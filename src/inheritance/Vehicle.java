package inheritance;

// Parent Class
class VehicleDemo {

    String brand ;
    String model;

    void setVehicleDetails (String brand , String model)
    {
     this.brand = brand ;
     this. model = model ;
    }

    void setDisplayVehicleDetails()
    {
        System.out.println("=================================  ");
        System.out.println("        VEHICLE DETAILS      "      );
        System.out.println("=================================  ");
        System.out.println(" * BRAND :- " + brand);
        System.out.println(" * MODEL :- " + model);
        System.out.println();
    }

}

// Child Class
class Car extends VehicleDemo {
    String fuel;
    int seatingCapacity ;
    String mileage ;

    void setCarDetails(String fuel, int seatingCapacity , String mileage)
    {
        this.fuel = fuel ;
        this.seatingCapacity = seatingCapacity ;
        this.mileage = mileage ;
    }

    void displayCarDetails()
    {
        System.out.println("=================================  ");
        System.out.println("          CAR DETAILS "             );
        System.out.println("=================================  ");
        System.out.println(" * Fuel Type :- " + fuel);
        System.out.println(" * Seats :- " + seatingCapacity);
        System.out.println(" * Mileage :- " + mileage);
        System.out.println();
    }
}

class Bike extends VehicleDemo {

    String engine ;
    String abs ;
    String mileage ;

    void setBikeDetails (String engine , String abs , String mileage)
    {
        this.engine = engine ;
        this.abs = abs ;
        this.mileage = mileage;
    }

    void displayBikeDetails()
    {
        System.out.println("=================================  ");
        System.out.println("         BIKE DETAILS              ");
        System.out.println("=================================  ");
        System.out.println(" * Engine :- " + engine);
        System.out.println(" * ABS :- " + abs);
        System.out.println(" * Mileage :- " + mileage);
        System.out.println();
    }
}

public class Vehicle {
    public static void main (String args []){

        Car c1 = new Car ();
        c1.setVehicleDetails(" BMW ", " 7 Series ");
        c1.setDisplayVehicleDetails();
        c1.setCarDetails("Petrol" , 6 , "18 km");
        c1.displayCarDetails();
        Bike b1 = new Bike ();
        b1.setVehicleDetails(" Royal Enfield " , " Hunter 350 ");
        b1.setDisplayVehicleDetails();
        b1.setBikeDetails("350 cc" , " Double Channel ABS " , "30 km");
        b1.displayBikeDetails();
    }

}
