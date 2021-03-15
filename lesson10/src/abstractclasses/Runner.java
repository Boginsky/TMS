package abstractclasses;

public class Runner {

    public static void main(String[] args) {

        LightVehicles lightVehicles = new LightVehicles(80, 120, 1000, "Audi", 4, 40, "Седан", 4);
        CargoVehicles cargoVehicles = new CargoVehicles(400,50,10000,"MAZ",8,300,1000);
        Civil civilPlane = new Civil(1000,5000,20000,"Boing",16,5,500,false);
        Military militaryPlane = new Military(1000,8000,5000,"IL",8,3,true,20);




        cargoVehicles.show();
        System.out.println("");
        lightVehicles.show();
        System.out.println("");
        civilPlane.show();
        System.out.println("");
        militaryPlane.show();

        System.out.println("-------------");

        lightVehicles.show2(120);
    }
}
