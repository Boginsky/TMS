package Metoda_Java_Begginer;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//        произведение, т.е. факториал числа.

public class Task9 {

    public static void main(String[] args) {

        int factorial = 1;
        int x = (int) (Math.random() * 20);


        while (x != 0) {
            factorial *= x;
            x = (int) (Math.random() * 20);
            if (x == 0) {
                break;
            }
        }
        System.out.println("Факториал: " + factorial);

    }
}

