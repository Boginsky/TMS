package Other;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное
//        оно или отрицательное. Например, "это однозначное положительное число". Достаточно будет
//    определить, является ли число однозначным, "двузначным или трехзначным и более.


        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        int numberLength = number.toString().length();
        if (number < 0) {
            numberLength -= 1;
        }


        if (numberLength == 1) {
            if (number > 0) {
                System.out.println("Это однозначное положительное число");
            } else if (number < 0) {
                System.out.println("Это однозначное отрицательное число");
            } else {
                System.out.println("Это ноль");
            }
        }
        if (numberLength == 2) {
            if (number > 0) {
                System.out.println("Это двузначное положительное число");
            } else {
                System.out.println("Это отрицательное двузначное число");
            }
        }
        if (numberLength == 3) {
            if (number > 0) {
                System.out.println("Это трехзначное положительное число");
            } else {
                System.out.println("Это отрицательное трехзначное число");
            }
        }

    }
}
