package interfaces.kosmodrom;

import java.util.Random;

public class SpaceX implements IStart {


    Random random = new Random();
    boolean a = random.nextBoolean();

    public void prelaunchCheck() {
        if (a == true) {
            System.out.println("Предстартовая проверка прошла успешно");
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }


    public void startEngine() {
        if (a  == true) {
            System.out.println("Двигатели SpaceX запущены.Все системы в норме");
        }
    }

    public void start() {
        if (a == true) {
            System.out.println("Cтарт шатла SpaceX");
        }
    }
}

