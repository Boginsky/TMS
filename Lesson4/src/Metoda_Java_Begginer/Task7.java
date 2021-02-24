package Metoda_Java_Begginer;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

//        Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.


        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер первой стороны");
        int a = in.nextInt();
        System.out.println("Введите размер второй стороны");
        int b = in.nextInt();
        System.out.println("Введите радиус");
        int radius = in.nextInt();

        double diagonal = Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));

        double diametr = radius * 2;

        if (diametr >= diagonal){
            System.out.println("Можно закрыть");
        }else{
            System.out.println("Нельзя закрыть");
        }

    }
}
