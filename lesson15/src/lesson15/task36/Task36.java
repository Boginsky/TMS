package lesson15.task36;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//        должны быть распечатаны отдельно.

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task36 {
    public static void main(String[] args) {
        File dir = new File("F:\\Anno 1800\\maindata\\");
        String arrFiles = dir.getParent();
//        List<String> lst = Arrays.asList(arrFiles);
        System.out.println("Директория:");
        System.out.println(arrFiles);

        System.out.println("");
        System.out.println("Список файлов в директории:");
        String[] array = dir.list();
        List<String> lst1 = Arrays.asList(array);
        System.out.println(lst1);

    }
}
//Вывод в консоль:
//Директория:
//        F:\Anno 1800
//
//        Список файлов в директории:
//        [checksum.db, data0.rda, data1.rda, data10.rda, data11.rda, data12.rda, data13.rda, data14.rda, data15.rda, data16.rda, data2.rda, data3.rda, data4.rda, data5.rda, data6.rda, data7.rda, data8.rda, data9.rda, en_us0.rda, en_us1.rda, en_us2.rda, en_us3.rda, en_us4.rda, en_us5.rda, file.db, ru_ru0.rda, ru_ru1.rda, ru_ru2.rda, ru_ru3.rda, ru_ru4.rda, ru_ru5.rda]
