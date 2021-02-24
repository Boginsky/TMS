package Metoda_Java_Begginer;


//Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        int summ = 0;
        System.out.println("Введите 5 чисел");


        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }

        int indexForMax = 0;
        int indexForMin = 0;
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int score = array[i];
            if (min > score) {
                min = score;
                indexForMin = i;
            }
            if (max < score) {
                max = score;
                indexForMax = i;
            }
        }

        int sum = 0;

        if (indexForMax < indexForMin) {
            for (int i = indexForMax; i <= indexForMin; i++) {
                sum += array[i];
            }
        } else {
            for (int i = indexForMin; i <= indexForMax; i++) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }

}
