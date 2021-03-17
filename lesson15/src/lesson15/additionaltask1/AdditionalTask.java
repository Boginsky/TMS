package lesson15.additionaltask1;

import java.io.*;
import java.util.ArrayList;
//1)В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы

public class AdditionalTask {
    public static void main(String[] args) throws IOException {

        File f = new File("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\additionaltask\\Text.txt");

        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();
        System.out.println("Все слова:");
        while (line != null) {
            System.out.print(line + " ");

            StringBuffer rev = new StringBuffer(line).reverse();
            String strRev = rev.toString();

            if (line.equals(strRev)) {
                list.add(line);
            }
            line = br.readLine();
        }
        System.out.println("");
        System.out.println("Все полиндромы из файла:");
        System.out.println(list);

        File f2 = new File("E:\\TMS_DEV\\TMS\\lesson15\\src\\lesson15\\additionaltask\\Text2.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f2))) {
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        }
    }
}

