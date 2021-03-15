package task26;

public class Fridge extends Appliances {

    String model;
    int maxTemp;
    int minTemp;

    Fridge(String name, int capacity, int weight,String model,int maxTemp,int minTemp){
        super(name, capacity, weight);
        this.model = model;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

}
