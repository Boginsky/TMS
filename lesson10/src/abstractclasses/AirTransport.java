package abstractclasses;

public class AirTransport extends Transport {

    int wingspan;
    int minLengthOfRunway;

    AirTransport(){

    }

    AirTransport(int capasity,int maxSpeed, int weight,String brand,int wingspan,int minLengthOfRunway){
        super(capasity,maxSpeed,weight, brand);
        this.wingspan = wingspan;
        this.minLengthOfRunway = minLengthOfRunway;

    }
}
