package Metoda_Java_Begginer;

//Найдите сумму первых n целых чисел, которые делятся на 3.


import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа, которые делиться на 3");
        int count = 0;
        int summ = 0;

        while (count < 3) {

            int number = in.nextInt();

            if (number % 3 == 0) {
                summ += number;
                count++;
            } else {
                System.out.println("Вы ввели неправильное число");
                System.out.println("Попробуйте снова");
            }

        }
        System.out.println("Сумма чисел = " + summ);
    }
}
