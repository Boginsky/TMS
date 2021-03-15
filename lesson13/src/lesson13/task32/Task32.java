package lesson13.task32;

//Задание 32
//
//        Имеется текст. Следует составить для него частотный словарь.

import java.util.*;

public class Task32 {
    public static void main(String[] args) {

        String text = new String("Большой большой большой супер ультра огромный текст или просто набор слов который супер супер супер сложно читать 4 4 4 4 ");


        System.out.println("");
        System.out.println("Частотный словарь:");
        dictionary(text);

    }


    static void dictionary(String str) {

        HashMap<String,Integer>  map = new HashMap<>();

        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        }


}