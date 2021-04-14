package lesson17.task1;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;


    synchronized void giveBook(Visitor reader, Book book) {
        ArrayList<Book> readerBooks = reader.getBooks();
        readerBooks.add(book);
        reader.setBooks(readerBooks);
        books.remove(book);
        System.out.println("Visitor " + reader.getName() + " has taken the book "
                + book.getName());
    }

    synchronized void returnBook(Visitor reader, Book book) {
        ArrayList<Book> readerBooks = reader.getBooks();
        readerBooks.remove(book);
        reader.setBooks(readerBooks);
        books.add(book);
        System.out.println("Visitor " + reader.getName() + " has returned the book "
                + book.getName());
    }

    ArrayList<Book> getBooks(){
        return books;
    }

    void setBooks(ArrayList<Book> books){
        this.books = books;
    }
}
