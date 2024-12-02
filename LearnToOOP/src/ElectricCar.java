import interfaces.Chargeable;

public class ElectricCar extends Vehicle implements Chargeable {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity){
        super(brand,model,year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Batteriekapazität: " + batteryCapacity + "%");
    }

    @Override
    public void honk(){
        System.out.println("Hupe: Leise Beep!");
    }

    @Override
    public void accelerate(){
        if(batteryCapacity > 0){
            speed += 10;
            System.out.println("Das E-Auto beschleunigt");
            batteryCapacity -= 10;
        }else{
            System.out.println("Das Fahrzeug muss geladen werden.");
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
            speed = 0;
        }
    }
    @Override
    public void charge(){
        batteryCapacity = 100;
        System.out.println("Fahrzeug geladen auf " + batteryCapacity + "%");
    }




}
