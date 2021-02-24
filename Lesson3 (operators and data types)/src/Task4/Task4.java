package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int numberOut = 0;
        int result = 0;

        while (number != 0) {   // Создаем цикл
            numberOut += number % 10; // любое число будет % на 10 будет получаться последнее число
            number /= 10; // укорачиваем наше число на последнию цифру
            if (number != 0) { // проверяем условие
                if (result <= 0) {
                    result = result + numberOut;

                } else {
                    result = result + (numberOut % 10);
                }
                numberOut *= 10; // увеличиваем результат на десяток для последующего хода цикла
            }
        }

        System.out.println(numberOut);
        System.out.println(result);
    }
}