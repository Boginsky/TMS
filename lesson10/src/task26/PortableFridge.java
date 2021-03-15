package task26;

public class PortableFridge extends Fridge {

    int batteryPower;
    int operationTime;

    PortableFridge(String name, int capacity, int weight,String model,int maxTemp,int minTemp, int batteryPower, int operationTime){
        super(name, capacity, weight,model,maxTemp,minTemp);
        this.batteryPower = batteryPower ;
        this.operationTime = operationTime;

    }

}
