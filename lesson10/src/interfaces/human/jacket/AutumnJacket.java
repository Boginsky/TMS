package interfaces.human.jacket;

public class AutumnJacket implements IJacket {
    public void putOn(){
        System.out.println("Человек надевает осеннюю куртку");
    }

    public void putOff(){
        System.out.println("Человек снимает осеннюю куртку");
    }
}
