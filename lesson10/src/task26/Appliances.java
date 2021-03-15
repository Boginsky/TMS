package task26;

public class Appliances {

    String name;
    int capacity;
    boolean powerOn;
    int weight;

    Appliances(){

    }

    Appliances(String name, int capacity, int weight){
        this.name = name;
        this.capacity = capacity;
        this.weight = weight;
    }

    void perfomance(){

    }

    void powerOn(){
        if (powerOn = true){
            System.out.println("Прибор работает");
        }else{
            System.out.println("Прибор выключен");
        }
    }

}
