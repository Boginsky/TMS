package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 22
//        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//        записаных по правилам Java, с помощью регулярных выражений и вывести их на
//        страницу.


public class Task22 {

    public static void main(String[] args) {
        String string = "858BADE29DD24dasadsadsasd32512ABCDEF";
        Pattern p = Pattern.compile("[0-9A-F]*");
        Matcher m = p.matcher(string);
        while(m.find()){
            System.out.print(m.group() + " ");
        }
        System.out.println();
    }
}
