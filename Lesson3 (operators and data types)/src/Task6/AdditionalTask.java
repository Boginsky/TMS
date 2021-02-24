package Task6;

import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//
//            for (int z = 5; z > i; z--) {
//                System.out.print(" ");
//            }
//            for (int j = -1; j < i * 2; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i >= 0; i--) {
//
//            for (int j = 7; j > i; j--) {
//                System.out.print(" ");
//            }
//
//
//            for (int z = 3; z < i * 2; z++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        System.out.println("Введите количество клиентов");
        Scanner in = new Scanner(System.in);

        int numberOfClients = in.nextInt();
        int fin = 1;

        do{
            fin *= numberOfClients--;

        }while(numberOfClients>0);
        System.out.println(fin);

    }
}
