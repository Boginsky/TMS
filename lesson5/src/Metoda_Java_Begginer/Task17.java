package Metoda_Java_Begginer;

//
//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//        таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1
public class Task17 {

    public static void main(String[] args) {

        int array[][] = new int[5][5];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0 + count; j < array.length - count; j++) {
                array[i][j] = 1;
            }
            count++;
        }
        count = 1;
        for (int i = 3; i < array.length; i++) {
            for (int j = 0 + count; j < array.length - count; j++) {
                array[i][j] = 1;
            }
            count = 0;
        }



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
