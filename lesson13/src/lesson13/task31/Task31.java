package lesson13.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Задание 31
//        Создать список оценок учеников с помощью ArryList, заполнить случайными
//        оценками. Найти самую высокую оценку с использованием итератора.

public class Task31 {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20 ; i++) {
            list.add(rand.nextInt(50));
        }
        System.out.println(list);
        int number = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){

            Integer tmp = iterator.next();
            if (number < tmp){
                number = tmp;
            }
        }

        System.out.println("Самое большое число : " + number);

    }
}
