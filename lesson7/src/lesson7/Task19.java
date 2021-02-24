package lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task19 {

    public static void main(String[] args) {

        String str = (" sadads sdasdasd asdasdasd asdasda da as d   ");
        str = str.trim();
        int count = 0;
        Pattern p = Pattern.compile("[a-z]\\b");
        Matcher m = p.matcher(str);
        while(m.find()){
            count++;
        }
        System.out.println("Количество слов равно " + count);
    }
    }