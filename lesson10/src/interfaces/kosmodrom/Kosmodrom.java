package interfaces.kosmodrom;

public class Kosmodrom {

    static void start(IStart iStart) {
        iStart.prelaunchCheck();
        iStart.startEngine();
        iStart.start();
    }

    public static void main(String[] args) {

        IStart iStart = new Shuttle();
        Kosmodrom.start(iStart);
        System.out.println("_______");
        IStart iStart1 = new SpaceX();
        Kosmodrom.start(iStart1);

    }
}



