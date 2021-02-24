package interfaces.human;

import interfaces.human.jacket.AutumnJacket;
import interfaces.human.pants.WinterPants;
import interfaces.human.shoes.SpringShoes;

public class Runner {
    public static void main(String[] args) {

        Human human = new Human(new AutumnJacket(),new WinterPants(),new SpringShoes());

        human.putOn();
        System.out.println("");
        human.putOff();
    }

}
