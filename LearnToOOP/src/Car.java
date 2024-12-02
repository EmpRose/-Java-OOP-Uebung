import interfaces.Refuelable;

public class Car extends Vehicle implements Refuelable {
    private int fuelLevel;

    // Konstruktor
    public Car(String brand, String model, int year){
        super(brand,model,year);
        this.fuelLevel = 50; // Standardwert
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Treibstoff: " + fuelLevel + "L");
    }

    @Override
    public void honk(){
        System.out.println("Hupe: Beep Beep!");
    }

    @Override
    public void accelerate(){
        if(fuelLevel > 0){
            speed += 10;
            System.out.println("Das Auto beschleunigt.");
            fuelLevel -= 5;
        }else{
            System.out.println("Kein Treibstoff, bitte tanken.");
        }
    }

    @Override
    public void displaySpeed(){
        System.out.println("Geschwindigkeit: " + speed);
    }

    @Override
    public void brake(){
        if(speed >= 10){
            speed -= 10;
        }else{
            speed=0;
        }
    }

    @Override
    public void refuel(int amount) {
        fuelLevel += amount;
        System.out.println("Auto betankt! Treibstoffstand: " + fuelLevel + " Liter");
    }






}
