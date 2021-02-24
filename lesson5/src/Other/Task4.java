package Other;

//Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.

public class Task4 {

    public static void main(String[] args) {

        int a = 5;
        int b = 100;
        int result = 0;

        for (int i = 0; i < b ; i++) {
            result += a;

        }
        System.out.println(result);

    }
}
