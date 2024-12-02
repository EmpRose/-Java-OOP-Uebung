import interfaces.Chargeable;
import interfaces.Refuelable;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        /*
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("BMW","M3",2020));
        vehicles.add(new ElectricCar("Tesla","Model S",2023,50));
        vehicles.add(new Motorcycle("Dukati","SLine",2010,2,75));

        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
            vehicle.honk();

            System.out.println("\n-----------------\n");
        }*/

        Car bmw = new Car("BMW","M3",2020);
        ElectricCar tesla = new ElectricCar("Tesla","Model S",2023,50);
        Motorcycle dukati = new Motorcycle("Dukati","S Line",2010,2,75);

        List<Refuelable> refueableVehicles = new ArrayList<>();
        refueableVehicles.add(bmw);
        refueableVehicles.add(dukati);

        List<Chargeable> chargeableVehicles = new ArrayList<>();
        chargeableVehicles.add(tesla);
        chargeableVehicles.add(dukati);


        for ( Refuelable refuelable : refueableVehicles){
            refuelable.refuel(20);
            System.out.println("-----");
        }

        for( Chargeable chargeable : chargeableVehicles){
            chargeable.charge();
            System.out.println("-----");
        }

        bmw.accelerate();
        tesla.accelerate();
        dukati.accelerate();
    }
}
