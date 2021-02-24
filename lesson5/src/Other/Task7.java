package Other;

//7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99

public class Task7 {

    public static void main(String[] args) {

        int summ = 0;
        for (int i = 0; i <= 99; i++) {
            if(i % 2 != 0){
                summ += i;
            }
        }
        System.out.println(summ);

    }
}
