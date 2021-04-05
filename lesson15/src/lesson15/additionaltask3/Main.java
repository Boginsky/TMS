package lesson15.additionaltask3;

//3) Проверка на цензуру:
//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//определите сами, хотите каждое слово на новой строке, хотите через запятую
//разделяйте, ваша программа делайте как считаете нужным.
//Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//встретилось ни одного недопустимого слова, то выводите сообщение о том что
//текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//сообщение, кол-во предложений не прошедших проверку и сами предложения
//подлежащие исправлению.

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\additionaltask3\\origin.txt"));
        String res = bufferedReader.readLine();

        ArrayList<String> list = new ArrayList<>();
        while (res != null) {
            list.add(res);
            res = bufferedReader.readLine();
        }

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\additionaltask3\\blacklist.txt"));
        String res1 = bufferedReader1.readLine();

        ArrayList<String> list1 = new ArrayList<>();
        while (res1 != null) {
            list1.add(res1);
            res1 = bufferedReader1.readLine();
        }

        boolean result = false;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                result = method(list1.get(i), list.get(j));
                if(result == true){
                    break;
                }
            }
            if (result == true) {
                System.out.println("Проверка на цензуру не пройдена!");
                break;
            }
        }
        if (result == false) {
            System.out.println("Проверка на цензуру пройдена");
        }
    }

    static boolean method(String str, String str1) {
        boolean result = false;
        String[] words1 = str.split("\\s");
        String[] words = str1.split("\\s");
        for (int i = 0; i < words1.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words1[i].equals(words[j])) {
                    result = true;
                }
            }
        }
        return result;
    }
}



