package lesson7;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        long m = System.currentTimeMillis();
        System.out.println(m);

        String string = new String();

        for (int i = 0; i < 10000; i++) {
            String string1 = "Кирилл + ";
            if (string != string1) {
                string += string1;
            }
        }
        System.out.println(string);


        long m1 = System.currentTimeMillis();
        System.out.println(m1);

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 10000; i++) {

            String str2 = "Кирилл + ";
            str.append(str2);
        }
        System.out.println(str);

        long m2 = System.currentTimeMillis();
        System.out.println(m2);

        StringBuffer str1 = new StringBuffer();

        for (int i = 0; i < 10000; i++) {

            String str2 = "Кирилл + ";
            str1.append(str2);
        }
        System.out.println(str1);

        long m3 = System.currentTimeMillis();
        System.out.println(m3);

    }
}