package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите количество секунд");
        Scanner in = new Scanner(System.in);

        int sec = in.nextInt(); // общее количество секунд
        int secOut = sec % 60; // секунд на вывод
        int min = sec / 60; // общее количество минут
        int minOut = min % 60; // минут на вывод
        int hour = (min - minOut) / 60; // общее количество часов
        int hourOut = hour % 24; // часов на вывод
        int day = ((hour - hourOut) / 24); // количество дней;
        int dayOut = day % 7; //количество дней на вывод
        int week = (day - dayOut) / 7; // количество недель


        System.out.println("минут:" + min + "; " + "секунд:" + secOut);
        System.out.println("часы:" + hour + "; " + "минут:" + minOut + "; " + "секунд:" + secOut);
        System.out.println("дней: " + day + "; " + "часы:" + hourOut + "; " + "минут:" + minOut + "; " + "секунд:" + secOut);
        System.out.println("недель:" + week + "; " + "дней: " + dayOut + "; " + "часы:" + hourOut + "; " + "минут:" + minOut + "; " + "секунд:" + secOut);
    }
}
