package lesson17.task2;


public class Main {
    public static void main(String[] args) {
        boolean b = CheckForXML.checkXMLForXSD("E:\\TMS_DEV\\TMS\\lesson17\\src\\lesson17\\task2\\currency.xml", "E:\\TMS_DEV\\TMS\\lesson17\\src\\lesson17\\task2\\currency.xsd");
        System.out.println("Результат проверки XML файла :" + b);
        System.out.println("---------------------------------");
        ShoppingCenter center = new ShoppingCenter();
        Thread customer1 = new Thread(new Customer("Kirill",center),"KIRILL");
        Thread customer2 = new Thread(new Customer("Roma",center),"ROMA");
        Thread customer3 = new Thread(new Customer("Robert",center),"ROBERT");
        Thread customer4 = new Thread(new Customer("Jim",center),"JIM");
        Thread customer5 = new Thread(new Customer("Yuri",center),"YURI");

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();

    }
}
