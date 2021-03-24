package lesson17.task1;

import java.util.ArrayList;
import java.util.Random;

public class Visitor implements Runnable {
    private String name;
    private Library library;
    private ArrayList<Book> books;


    Visitor(Library library, String name) {
        this.library = library;
        this.name = name;
        books = new ArrayList<>();

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Visitor " + this.name + " at home");
                        Thread.sleep(5000);
                        break;
                    case 1:
                        System.out.println(Visitor.this.getName() + " entered the library");
                        Thread.sleep(2000);
                        break;
                    case 2:
                        if (library.getBooks().size() > 0) {
                            library.giveBook(Visitor.this, library.getBooks().get(new Random().nextInt(library.getBooks().size())));
                            Thread.sleep(2000);
                            if (Visitor.this.books.get(books.size() - 1).isVisiterRoomOnly()) {
                                readAtReadingRoom(Visitor.this.books.get(books.size() - 1));
                            }
                        }
                        break;
                    case 3:
                        if (Visitor.this.books.size() > 0) {
                            System.out.println("Visitor " + this.name + " is reading");
                            Thread.sleep(10000);
                            System.out.println("Visitor " + this.name + " returned book");
                        } else break;
                        break;
                    case 4:
                        System.out.println(Visitor.this.getName() + " left library");
                        Thread.sleep(2000);
                    case 5:
                        System.out.println("Visitor " + this.name + " returned at home");
                        Thread.sleep(5000);
                        break;
                    case 6:
                        System.out.println("Конец потока: " + Thread.currentThread().getName());
                        break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private  void readAtReadingRoom(Book book){
        try {
            System.out.println("Visitor " + this.name + " is reading the book " + book.getName() + " which is allowed to "
                    + "read only in reading room");
            Thread.sleep(10000);
            library.returnBook(Visitor.this, book);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    String getName() {
        return name;
    }

    ArrayList<Book> getBooks() {
        return books;
    }

    void setBooks(ArrayList<Book> books){
        this.books = books;
    }
}
