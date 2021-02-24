package Other;

//5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer number1 = in.nextInt();
        Integer number2 = in.nextInt();
        Integer number3 = in.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;


        if (number1 > 0) {
            positiveCount++;
        }else{
            negativeCount++;
        }
        if (number2 > 0) {
            positiveCount++;
        }else{
            negativeCount++;
        }
        if (number3 > 0) {
            positiveCount++;
        }else{
            negativeCount++;
        }
        System.out.println("Количество положительный чисел равно: " + positiveCount);
        System.out.println("Количество отрицательный чисел равно: " + negativeCount);

    }

}
