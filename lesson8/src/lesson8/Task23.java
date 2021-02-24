package lesson8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Задание 23
//        Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//        которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//        абзацев <p>.
public class Task23 {

    public static void main(String[] args) {

        String string = "1234<p id=”p1”>56789012131asdasd23r21312312313212313123122312asdasdasdadsadsds13123<p id=”p1”>123edasdasdasd1231241212312312<p id=”p1”>541wdfasdasdasdasd2312312312<p id=”p1”>3232123123112";
        Pattern p = Pattern.compile("\\<p.*?>");
        Matcher m = p.matcher(string);
        while(m.find()){
            string = string.replace(m.group(), "<p>" );
        }
        System.out.println(string);

    }

}
