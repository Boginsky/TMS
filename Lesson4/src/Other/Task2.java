package Other;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//        2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
//                Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого
//        треугольника. Требуется сравнить длину каждого отрезка-стороны с суммой двух других. Если хотя
//        бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами
//        не существует.


        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a + b >= c && a + c >= b && b + c >= a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Такого треугольника не существует");
        }

    }
}
