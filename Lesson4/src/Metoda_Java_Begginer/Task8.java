package Metoda_Java_Begginer;

import java.util.Random;

import static java.lang.Thread.*;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
//        while(true) {
        Random rand = new Random();
        int x = rand.nextInt();


        if (x >= 0) {
            if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
                if (x % 100 == 12 || x % 100 == 13 || x % 100 == 14) {
                    System.out.println(x + " рублей");
                } else {
                    System.out.println(x + " рубля");
                }
            } else if (x % 10 == 1) {
                if (x % 100 == 11) {
                    System.out.println(x + " рублей");
                } else {
                    System.out.println(x + " рубль");
                }
            } else {
                System.out.println(x + " рублей");
            }
        }
        if (x < 0) {
            if (x % 10 == -2 || x % 10 == -3 || x % 10 == -4) {
                if (x % 100 == -12 || x % 100 == -13 || x % 100 == -14) {
                    System.out.println(x + " рублей");
                } else {
                    System.out.println(x + " рубля");
                }
            } else if (x % 10 == -1) {
                System.out.println(x + " рубль");
            } else {
                System.out.println(x + " рублей");
            }
        }
//Thread.sleep(1000);
//}
    }
}
