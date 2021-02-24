package Metoda_Java_Begginer;

import java.util.Arrays;
import java.util.Scanner;

//Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера.

public class Task14 {

    public static void main(String[] args) {


        int array[] = {5, 6, 9, 3, 2};

        int min = array[0];
        int max = array[0];


        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int min2 = array[0];
        int indexForMin = 0;
        int max2 = array[0];
        int indexForMax = 0;
        for (int i = 0; i < array.length; i++) {
            int score = array[i];
            if (max2 < score) {
                max2 = score;
                indexForMax = i;
            }
            if (min2 > score) {
                min2 = score;
                indexForMin = i;
            }
        }

        System.out.println("Максимальная индекс оценки до сортировки " + max + " и ее индекс равен " + indexForMax);
        System.out.println("Максимальная индекс оценки до сортировки " + min + " и ее индекс равен " + indexForMin);

    }
}
