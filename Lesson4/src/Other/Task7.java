package Other;

import java.util.Scanner;

//7)  В переменную записываете количество программистов. В зависимости от количества программистов
//        необходимо вывести правильно окончание. Например: • 2 программиста • 1 программиста •
//        10 программистов • и т.д.

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x >= 0) {
            if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
                if (x % 100 == 12 || x % 100 == 13 || x % 100 == 14) {
                    System.out.println(x + " программистов");
                } else {
                    System.out.println(x + " программиста");
                }
            } else if (x % 10 == 1) {
                if (x % 100 == 11) {
                    System.out.println(x + " программистов");
                } else {
                    System.out.println(x + " программист");
                }
            } else {
                System.out.println(x + " программистов");
            }
        }

    }

}
