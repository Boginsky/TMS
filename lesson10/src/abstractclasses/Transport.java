package abstractclasses;

public class Transport {

    int capacity;
    int maxSpeed;
    int weight;
    String brand;

    Transport(){

    }

    Transport(int capacity, int maxSpeed, int weight, String brand){
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    double power(int capasity){
        double power = capasity * 0.74;
        return power;
    }

}
