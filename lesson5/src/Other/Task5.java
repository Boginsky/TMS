package Other;

//5)Напишите программу печати таблицы перевода расстояний из дюймов
//        всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task5 {

    public static void main(String[] args) {

        float cm = 2.54f;
        int inch = 1;
        float cmr = 0f;
        int inchr = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.print("Дюймы: " + inchr + " " + "Сантиметры: " + cmr);
            inchr += inch;
            cmr += cm;
            System.out.println(" ");
        }

    }
}