package lesson13.task30;

//Задание 30
//        Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//        числа.


import java.util.*;

public class Task30 {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(10));
        }
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("После удаления повторов:");
        System.out.println(list);

    }

}