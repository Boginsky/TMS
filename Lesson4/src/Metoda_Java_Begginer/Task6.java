package Metoda_Java_Begginer;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        
        //Создайте число. Определите, является ли число трехзначным. Определите, является
        //ли его последняя цифра семеркой. Определите, является ли число четным.

//        Создайте число. Определите, является ли число трехзначным. Определите, является
//        ли его последняя цифра семеркой. Определите, является ли число четным.

        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        String snumber = number.toString();
        int length = snumber.length();

        if (length == 3) {
            System.out.println("Число трехзначное");
        } else {
            System.out.println("Число не трехзначное");
        }

        if (number % 10 == 7) {
            System.out.println("Число заканчивается на " + 7);
        } else {
            System.out.println("Число не заканчивается на " + 7);
        }

        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

    }
}
