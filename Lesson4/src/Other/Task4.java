package Other;

// Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer number1 = in.nextInt();
        Integer number2 = in.nextInt();
        Integer number3 = in.nextInt();

        int count = 0;

        if (number1 > 0) {
            count++;
        }
        if (number2 > 0) {
            count++;
        }
        if (number3 > 0) {
            count++;
        }
        System.out.println("Количество положительный чисел равно: " + count);

    }
}
