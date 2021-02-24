
package lesson7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//        общее их количество.

public class Task18 {

    public static void main(String[] args) {
        int count = 0;

                String str = ("Если бы в следующее утро Степе Лиходееву сказали бы так: «Степа! Тебя расстреляют, если ты сию минуту не встанешь!» – Степа ответил бы томным, чуть слышным голосом: «Расстреливайте, делайте со мною, что хотите, но я не встану».");
        Pattern p = Pattern.compile("[?!:;,]");
        Matcher m = p.matcher(str);
        while(m.find()){
            count++;
        }
        System.out.println("Количество знаков припенания равно " + count);
        }


    }
