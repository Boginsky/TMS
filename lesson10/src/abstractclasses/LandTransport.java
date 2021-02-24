package abstractclasses;

public class LandTransport extends Transport {

    int amountOfWheels;
    int fuelConsumption;

    LandTransport(){

    }

    LandTransport(int capasity,int maxSpeed, int weight, String brand, int amountOfWheels, int fuelConsumption){
        super(capasity,maxSpeed,weight,brand);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;

    }




}
