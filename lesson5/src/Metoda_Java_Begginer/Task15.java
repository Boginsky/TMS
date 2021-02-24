package Metoda_Java_Begginer;

//Создать массив, заполнить его случайными элементами, распечатать,
//        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Введите 5 чисел");

        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }


        System.out.println("Первая сортировка");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.println("");
        System.out.println("Вторая сортировка");
        for (int i = 4; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}