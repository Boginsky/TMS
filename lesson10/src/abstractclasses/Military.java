package abstractclasses;

public class Military extends AirTransport {

    boolean ejectionSystem;
    int amoungOfRockets;

    Military(){

    }

    Military(int capasity,int maxSpeed, int weight,String brand,int wingspan,int minLengthOfRunway,boolean ejectionSystem, int amoungOfRockets){
        super(capasity,maxSpeed,weight,brand, wingspan, minLengthOfRunway);
        this.ejectionSystem = ejectionSystem;
        this.amoungOfRockets = amoungOfRockets;
    }


    void show() {
        System.out.println("Гражданский самолет с мощностью в лошадиных силах: " + capacity +
                ". C максимальной скоросью: " + maxSpeed + " км/ч. С весом: " + weight +
                " кг. Бренд самолета: " + brand + ". Имеет размах крыльев " + wingspan + " м . Минимальна длинна взлетной полосы: " +
                minLengthOfRunway + ". Наличие системы катапультирования: " + ejectionSystem + ". Количество ракет на борту: " + amoungOfRockets +"." + " Мощность в киловатах: " + power(capacity) );
    }


    void shoot (){
        if(amoungOfRockets != 0){
            System.out.println("Ракета пошла.....");
        }else{
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    void ejection(){
        if (ejectionSystem == true){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }

}
