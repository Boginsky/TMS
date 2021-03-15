package interfaces.human.jacket;

public class SpringJacket implements IJacket {
    public void putOn(){
        System.out.println("Человек надевает весеннюю куртку");
    }

    public void putOff(){
        System.out.println("Человек снимает весеннюю куртку");
    }
}

