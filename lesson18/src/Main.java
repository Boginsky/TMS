import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        boolean result = CheckForXML.checkXMLForXSD("E:\\TMS_DEV\\TMS\\lesson18\\src\\XMLFile.xml", "E:\\TMS_DEV\\TMS\\lesson18\\src\\XMLFile.xsd");
        System.out.println("Результат проверки xml документа на соответствие xsd схеме : " + result);
        System.out.println("---------------------------------------------------------------------------");
        System.err.println("ДЛЯ ВЫХОДА НАЖМИТЕ 0");
        System.out.println("Варианты работы:\n 1)Добавить книгу \n 2)Отредактировать книгу \n 3)Удалить книгу " +
                "\n 4)Вывести список всех книг \n 5)Вывести список книг определенного автора/жанра \n" +
                " 6)Вывести список книг по алфавиту");
        ArrayList<Book> list = DOMXMLParser.getAllBooksFromXML();
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);

        SQLTableSetter.SQLTableADD(list);


        while (isTrue) {
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    Book.additionOfBook(list);
                    System.out.println("Выберите новую операцию либо завершите выполнение программы:");
                    break;
                case 2:
                    Book.bookEditing(list);
                    System.out.println("Выберите новую операцию либо завершите выполнение программы:");
                    break;
                case 3:
                    Book.removeOfBook(list);
                    System.out.println("Выберите новую операцию либо завершите выполнение программы:");
                    break;
                case 4:
                    Book.showLibrary(list);
                    System.out.println("Выберите новую операцию либо завершите выполнение программы:");
                    break;
                case 5:
                    Book.showBookSpecific(list);
                    System.out.println("Выберите новую операцию либо завершите выполнение программы:");
                    break;
                case 6:
                    Book.showSortedList(list);
                    System.out.println("Выберите новую операцию либо завершите выполнение программы:");
                    break;
                case 0:
                    isTrue = false;
                    System.err.println("ВЫХОД");
                    break;
            }
        }
        sc.close();
    }
}