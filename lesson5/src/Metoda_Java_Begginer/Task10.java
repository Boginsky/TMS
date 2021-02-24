package Metoda_Java_Begginer;

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        long factorial = in.nextInt();
        long result = 1;

        for (int x = 1; x <= factorial; x ++){

         result *= x;
        }

        System.out.println(result);
    }

}
