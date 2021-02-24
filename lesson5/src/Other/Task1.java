package Other;


//1)Начав тренировки, спортсмен в первый день пробежал 10 км.
//        Каждыйдень он увеличивал дневную норму на 10% нормы
//        предыдущего дня. Какойсуммарный путь пробежит спортсмен за 7 дней?
public class Task1 {

    public static void main(String[] args) {

        int day = 7;
        double start = 10;
        double percent = 0.1;
        double result = 0;


        for (int i = 1; i < day; i++) {
            start = start * 0.1 + start;
            result = (start * 0.1 + start) + result;

        }
        System.out.println(result);

    }

}
