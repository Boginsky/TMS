package abstractclasses;

public class CargoVehicles extends LandTransport {

    int liftingCapacity;


    CargoVehicles(){

    }

    CargoVehicles(int capasity,int maxSpeed, int weight,String brand, int amountOfWheels, int fuelConsumption, int liftingCapacity){
        super(capasity,maxSpeed,weight,brand,amountOfWheels,fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    void show() {
        System.out.println("Грузовая машина с мощностью в лошадиных силах: " + capacity +
                ". C максимальной скоросью: " + maxSpeed + " км/ч. С весом: " + weight +
                " кг. Бренд автомобиля: " + brand + ". Имеет " + amountOfWheels + " колеса. Расход топлива на 100 км/л: " +
                fuelConsumption + ". С грузопоъемностью в тоннах : " + liftingCapacity + "." + " Мощность в киловатах: " + power(capacity));
    }

    void addCargo(int weight){
        if (weight < liftingCapacity ){
            System.out.println("Грузовик загружен");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }




}
