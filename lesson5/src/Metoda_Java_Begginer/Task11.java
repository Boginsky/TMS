package Metoda_Java_Begginer;

//Имеется целое число, определить является ли это число простым, т.е.
//        делится без остатка только на 1 и себя.


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        int count = 0;


        if (number > 1 && number % number == 0) {
            for (int i = 2; i <= number; i++) {
                if (i == number) {
                    continue;
                }
                if (number % i == 0) {
                    count ++;
                    break;
                }
            }
        }
        if (count == 0){
            System.out.println("Число простое");
        }else {
            System.out.println("Число непростое");
        }
    }
}
