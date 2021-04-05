package lesson15.task33;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task33 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileInputStream("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\task33\\Task33.txt"));
        int amountOfWords = 0;
        while(sc.hasNext()){
            sc.next();
            amountOfWords++;
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\task33\\Task33.txt"));
        String res = bufferedReader.readLine();
        int amountOfMarks = 0;
        while (res != null) {
            Pattern pattern = Pattern.compile("[.,?/;']+");
            Matcher matcher = pattern.matcher(res);
            while (matcher.find()) {
                amountOfMarks++;
            }
            res = bufferedReader.readLine();
        }
            System.out.println("Количество слов: " + amountOfWords + ". Количество знаков препинания: " + amountOfMarks + ".");



    }
}
