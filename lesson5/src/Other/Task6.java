package Other;

//6)Напишите программу вывода всех четных чисел от 2 до 100 включительно

public class Task6 {

    public static void main(String[] args) {

        int number = 0;
        int summ = 0;
        for (int i = 1; i <= 100; i++) {
            if(number % 2 == 0){
                System.out.print(number + " | ");
            }
            number++;
        }
    }

}
