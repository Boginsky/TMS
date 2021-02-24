package abstractclasses;

public class Civil extends AirTransport {

    int amountOfPassengers;
    boolean businessClass;

    Civil(){

    }

    Civil(int capasity,int maxSpeed, int weight,String brand,int wingspan,int minLengthOfRunway, int amountOfPassengers, boolean businessClass){
        super(capasity,maxSpeed,weight,brand,wingspan,minLengthOfRunway);
        this.amountOfPassengers = amountOfPassengers;
        this.businessClass = businessClass;
    }

    void show() {
        System.out.println("Гражданский самолет с мощностью в лошадиных силах: " + capacity +
                ". C максимальной скоросью: " + maxSpeed + " км/ч. С весом: " + weight +
                " кг. Бренд самолета: " + brand + ". Имеет размах крыльев " + wingspan + " м . Минимальна длинна взлетной полосы: " +
                minLengthOfRunway + ". Количество пассажиров: " + amountOfPassengers + ". Наличие бизнесскласса: " + businessClass + "."+ " Мощность в киловатах: " + power(capacity));
    }


    void addPassengers(int amountOfPassengers1){
        if (amountOfPassengers1 < amountOfPassengers){
            System.out.println("Пассажиры в самолете");
        }else{
            System.out.println("Вам нужен самолет побольше");
        }

    }





}
