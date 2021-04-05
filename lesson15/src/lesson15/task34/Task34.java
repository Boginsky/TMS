package lesson15.task34;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
public class Task34 {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\task34\\Task34.txt"));
        String res = bufferedReader.readLine();
        int sum = 0;
        System.out.println("Все числа:");
        while (res != null){
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(res);
            while ( matcher.find()){
                list.add(Integer.parseInt(matcher.group()));
                sum +=  Integer.parseInt(matcher.group());
                System.out.print(matcher.group() +" ");
            }
            res = bufferedReader.readLine();
        }
        System.out.println("");
        System.out.println("Сумма чисел равна: " + sum);


        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("Числа после удаления одинаковых чисел:");
        System.out.println(list);
    }

}
