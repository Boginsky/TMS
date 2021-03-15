package interfaces.human.pants;

public class SpringPants implements IPants {
    public void putOn(){
        System.out.println("Человек надевает весенние штаны");
    }

    public void putOff(){
        System.out.println("Человек снимает весенние штаны");
    }
}
