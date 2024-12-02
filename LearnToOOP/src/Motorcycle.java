import interfaces.Chargeable;
import interfaces.Refuelable;

public class Motorcycle extends Vehicle implements Refuelable, Chargeable {
    private static int wheels;
    private static int fuelLevel;
    private static int batteryCapacity;

    public Motorcycle(String brand, String model, int year, int wheels, int batteryCapacity){
        super(brand,model,year);
        this.wheels = wheels;
        this.fuelLevel = 50;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Dieses Model hat " + wheels + " Räder.");
        System.out.println("Treibstoff: " + fuelLevel + "L");
        System.out.println("Batterie auf: " + batteryCapacity + "%");
    }
    @Override
    public void honk(){
        System.out.println("Hupe: Nup Nup");
    }

    @Override
    public void accelerate(){
            if(fuelLevel > 0){
                speed += 20;
                System.out.println("Motorrad beschleunigt");
                fuelLevel -= 5;
            }else if (batteryCapacity > 0){
                speed += 20;
                System.out.println("Motorrad beschleunigt");
                batteryCapacity -= 5;
            }else{
                System.out.println("Tank und Batterie leer");
            }
    }

    @Override
    public void displaySpeed(){
        System.out.println("Geschwindigkeit: " + speed);
    }

    @Override
    public void brake(){
        if(speed > 20)
            speed -= 20;
        else
            speed = 0;
    }

    @Override
    public void charge() {
        batteryCapacity = 100;
        System.out.println("Motorradbatterie aufgeladen auf: " + batteryCapacity + "%");
    }

    @Override
    public void refuel(int amount) {
        fuelLevel += amount;
        System.out.println("Motorrad betankt! Treibstoffstand: " + fuelLevel + "L ");
    }
}
