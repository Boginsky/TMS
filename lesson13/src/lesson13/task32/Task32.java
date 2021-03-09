package lesson13.task32;

//Задание 32
//
//        Имеется текст. Следует составить для него частотный словарь.

import java.util.*;

public class Task32 {
    public static void main(String[] args) {

        String text = new String("Большой большой большой супер ультра огромный текст или просто набор слов который супер супер супер сложно читать 4 4 4 4 ");

        ArrayList<String> list = new ArrayList<>();

        for (String s : text.split(" ")) {
            list.add(s);
        }
        System.out.println(list);

        System.out.println("");
        System.out.println("Частотный словарь:");
        System.out.println(dictionary(list).toString());
    }


    static Map<String, Integer> dictionary(ArrayList<String> list) {

        Map<String, Integer> map = new HashMap<>();

        int tmp = 1;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    tmp++;
                }
            }
            map.put(list.get(i), --tmp);
            tmp = 1;
        }


        return map;
    }



}