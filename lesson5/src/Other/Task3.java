package Other;

//3)Вычислить: 1+2+4+8+...+256

public class Task3 {

    public static void main(String[] args) {

     int summ = 0;

        for (int i = 1; i <= 256;i*=2) {

            summ += i;
        }
        System.out.println(summ);

    }

}
