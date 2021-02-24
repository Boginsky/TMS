package Paliadrom;


import java.util.Scanner;

public class Paliadrom {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        String snumber = number.toString();

        int lengthSNumber = snumber.length();
        char[] result = snumber.toCharArray();
        int j = lengthSNumber - 1;
        int counter = 0;
        for (int i = 0; i < lengthSNumber; i++) {
            if (result[i] != result[j - i]) {
                counter += 1;
            }
        }
        if (counter > 0) {
            System.out.println("Число не является Палиадромом");
        } else {
            System.out.println("Число является Палиадромом");
        }

    }
}
