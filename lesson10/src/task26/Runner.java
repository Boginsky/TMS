package task26;

//Задание 26
//        Создать иерархию классов, описывающих бытовую технику. Создать несколько
//        объектов описанных классов, часть из них включить в розетку.
//        Иерархия должна иметь хотя бы три уровня.

public class Runner {

    public static void main(String[] args) {

        Appliances example = new Appliances("Vaccum cleaner",20,10);
        example.powerOn = false;
        example.powerOn();

        System.out.println("");

        Fridge fridge = new Fridge("Fridge",40,40,"Samsung",40,-40);
        fridge.powerOn = false;
        fridge.powerOn();

        System.out.println("");

        PortableFridge portableFridge = new PortableFridge("Portable Fridge",40,40,"LG",40,-40,80,8);

    }

}
