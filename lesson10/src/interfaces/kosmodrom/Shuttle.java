package interfaces.kosmodrom;

import java.util.Random;

public class Shuttle implements IStart {


    Random random = new Random();
    int a = random.nextInt(10);

    public void prelaunchCheck() {
        if (a > 3) {
            System.out.println("Предстартовая проверка прошла успешно");
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }


    public void startEngine() {
        if (a > 3) {
            System.out.println("Двигатели Шатла запущены.Все системы в норме");
        }
    }

    public void start() {
        if (a > 3) {
            System.out.println("Cтарт шатла");
        }
    }
}
