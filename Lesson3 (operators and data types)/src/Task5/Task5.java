package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        String snumber = number.toString();

        int lengthSNumber = snumber.length();
        char[] result = snumber.toCharArray();
        int main1 = 0;

        for (int i = 0; i < lengthSNumber; i++) {
            for (int j = i + 1; j < lengthSNumber; j++) {
                if (result[i] == result[j]) {
                    main1++;
                }
            }
        }

        if (main1 > 0) {
            System.out.println("Не все числа разные");
        } else {
            System.out.println("Все числа разные");
        }

    }
}