package lesson17.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean b = CheckForXML.checkXMLForXSD("E:\\TMS_DEV\\TMS\\lesson17\\src\\lesson17\\task1\\XMLFile.xml","E:\\TMS_DEV\\TMS\\lesson17\\src\\lesson17\\task1\\XMLFile.xsd");
        System.out.println("Результат проверки XML файла :"  + b);
        System.out.println("---------------------");
        ArrayList<Book> books = DOMXMLParser.getAllBooksFromXML();
        Library library = new Library();
        library.setBooks(books);

        System.out.println("Cписок книг: ");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("------------------------------");

        Thread reader1 = new Thread(new Visitor(library,  "Kirill"), "KIRILL");
        Thread reader2 = new Thread(new Visitor(library,  "Roma"), "ROMA");
        Thread reader3 = new Thread(new Visitor(library,  "Robert"), "ROBERT");
        Thread reader4 = new Thread(new Visitor(library,  "Jim"), "JIM");

        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();

    }
}
