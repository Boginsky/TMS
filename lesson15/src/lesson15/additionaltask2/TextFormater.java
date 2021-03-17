package lesson15.additionaltask2;

import java.util.ArrayList;
import java.util.Scanner;

public class TextFormater {

    int methodAmountOfWords(String str){
        Scanner sc = new Scanner(str);
        int amountOfWords = 0;
        while (sc.hasNext()){
            sc.next();
            amountOfWords++;
        }
        return amountOfWords;
    }

    boolean methodPaliandrom (String str) {
        boolean result = false;
        String[] words = str.split("\\s");
        for (String word : words) {
            String rev = reverseString(word);

            if (word.equals(rev)) {
                result = true;
                break;
            }
            }
        return result;
        }
    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
    }
