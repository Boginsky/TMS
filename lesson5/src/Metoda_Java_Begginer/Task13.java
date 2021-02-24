package Metoda_Java_Begginer;

import java.util.Scanner;

//Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них.

public class Task13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int array[] = new int[3];
        System.out.println("Введите 3 рандомных числа");

        for (int i = 0; i<3;i++){
            array[i] = in.nextInt();
        }

        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++){
                if (array[i]<array[i - 1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1]=temp;
                    isSorted = false;
                }
           }
        }
        System.out.println("Самое большое число: " + array[2]);

    }

}
