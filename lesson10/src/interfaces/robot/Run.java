package interfaces.robot;

import interfaces.robot.hands.SamsungHand;
import interfaces.robot.hands.SonyHand;
import interfaces.robot.heads.SamsungHead;
import interfaces.robot.heads.SonyHead;
import interfaces.robot.heads.ToshibaHead;
import interfaces.robot.legs.SamsungLeg;
import interfaces.robot.legs.SonyLeg;
import interfaces.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        Robot robot1 = new Robot(new SamsungHead(44), new SonyHand(55), new ToshibaLeg(66));
        Robot robot2 = new Robot(new SonyHead(44), new SamsungHand(55), new ToshibaLeg(66));
        Robot robot3 = new Robot(new ToshibaHead(44) , new SonyHand(55), new SamsungLeg(66));

        robot1.action();
        System.out.println("");
        robot2.action();
        System.out.println("");
        robot3.action();


        System.out.println("");

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()){
            System.out.println("Самый дорогой робот 1");
        }else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()){
            System.out.println("Самый дорогой робот 2 ");
        }else{
            System.out.println("Самый дорогой робот 3");
        }








        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
