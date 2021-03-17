package lesson15.additionaltask2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//2)Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл.
//
//Пишем все в ООП стиле. Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
//
//В main считываем файл.
//Разбиваем текст на предложения. Используя методы класса TextFormater
//определяем подходит ли нам предложение. Если подходит добавляем его в
//новый файл

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedInputStream = new BufferedReader(new FileReader("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\additionaltask2\\Text.txt"));
        String res = bufferedInputStream.readLine();
        ArrayList<String> list = new ArrayList<>();
        while (res != null) {
            list.add(res);
            res = bufferedInputStream.readLine();
        }
        TextFormater textFormater = new TextFormater();
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (textFormater.methodPaliandrom(s)) {
                list1.add(s);
            } else if (textFormater.methodAmountOfWords(s) >= 3 && textFormater.methodAmountOfWords(s) <= 5) {
                list1.add(s);
            }
        }
        System.out.println(list1);
    }
}
