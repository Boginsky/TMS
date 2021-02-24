package interfaces.human;

import interfaces.human.jacket.IJacket;
import interfaces.human.pants.IPants;
import interfaces.human.shoes.IShoes;

public class Human implements IHuman {

    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(IJacket jacket, IPants pants, IShoes shoes){
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human(){}

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void putOn(){
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void putOff(){
        jacket.putOff();
        pants.putOff();
        shoes.putOff();
    }

}
