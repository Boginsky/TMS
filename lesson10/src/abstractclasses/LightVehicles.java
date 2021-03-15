package abstractclasses;

public class LightVehicles extends LandTransport {

    String bodyType;
    int amountOfPassengers;

    LightVehicles() {

    }

    LightVehicles(int capasity, int maxSpeed, int weight, String brand, int amountOfWheels, int fuelConsumption, String bodyType, int amountOfPassengers) {
        super(capasity, maxSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.amountOfWheels = amountOfWheels;
    }


    void show() {
        System.out.println("Легковая машина с мощностью в лошадиных силах: " + capacity +
                ". C максимальной скоросью: " + maxSpeed + " км/ч. С весом: " + weight +
                " кг. Бренд автомобиля: " + brand + ". Имеет " + amountOfWheels + " колеса. Расход топлива на 100 км/л: " +
                fuelConsumption + ". Тип кузова: " + bodyType + ". Количество пассажиров: " + amountOfPassengers + "." + " Мощность в киловатах: " + power(capacity));
    }



   int maxDistance(int time) {
        int maxDistance = maxSpeed * time;
       return  maxDistance;



    }

    private int fuelConsumption(int fuelConsumption, int time) {
        int maxDistance = maxSpeed * time;
        int allConsumption = maxDistance / fuelConsumption;
        return  allConsumption;
    }

    void show2(int time){
        System.out.println("За время " + time + " ч. Автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed  + " км/ч" +  " израсходует " + fuelConsumption(fuelConsumption,time) + " литров топлива." );
    }

}
