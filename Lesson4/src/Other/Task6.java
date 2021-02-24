package Other;

import java.util.Scanner;

//6) Даны 2 числа. Вывести большее из них

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        if (number1 > number2){
            System.out.println(number1);
        }else if (number2 > number1){
            System.out.println(number2);
        }else{
            System.out.println("Числа равны");
        }

    }
}
