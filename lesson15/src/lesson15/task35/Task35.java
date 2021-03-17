package lesson15.task35;

import java.io.*;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.

public class Task35 {
    public static void main(String[] args) {
        File f = new File("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\task35\\Task35.txt");

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new ObjectOutputStream(new FileOutputStream(f)))) {
            for (int i = 0; i < 20; i++) {
                bufferedOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new ObjectInputStream(new FileInputStream(f)))) {
            System.out.println("Все числа: ");
            while(bufferedInputStream.available() != 0) {
                    System.out.print(bufferedInputStream.read() +" ");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}