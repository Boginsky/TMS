package lesson13.task29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//        Задание 29
//        Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Удалить неудовлетворительные оценки из списка.

public class Task29 {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(10));
        }

        System.out.println(numbers);
        System.out.println("");


        System.out.println (removeNeg(numbers));

    }

    static ArrayList<Integer> removeNeg(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) > 4){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
