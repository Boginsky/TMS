package Other;

import java.util.Scanner;

//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через
//        3, 6, 9, 12,..., 24 часа.

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество часов кратное трем");
        int hour = in.nextInt();

        int amountOfAmeba = 1;

        int result = hour / 3;

        for (int i = 0; i < result ; i++) {
            amountOfAmeba *=2;

        }

        System.out.println("Количество амеб будет равно: " + amountOfAmeba + ", спустя " + hour + " часов");
        }

    }


