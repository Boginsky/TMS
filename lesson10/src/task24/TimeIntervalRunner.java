package task24;

//        Создать класс и объекты описывающие промежуток времени. Сам промежуток
//        в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//        Сделать методы для получения полного количества секунд в объекте, сравнения
//        двух объектов (метод должен работать аналогично compareTo в строках). Создать
//        два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//        по отдельности. Сделать метод для вывода данных.


public class TimeIntervalRunner {

    public static void main(String[] args) {

        int a = 5;
        Integer b = 4;

        TimeInterval example1 = new TimeInterval(44,10);
        TimeInterval example2 = new TimeInterval(a,b);
        TimeInterval example3 = new TimeInterval(4,5);

        example1.fullNumberOfSeconds(example1);
        example2.fullNumberOfSeconds(example2);
        example3.fullNumberOfSeconds(example3);

        System.out.println("----------");

        example1.showData();
        example2.showData();
        example3.showData();

    }


}
