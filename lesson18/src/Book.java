

import java.sql.SQLException;
import java.util.*;

public class Book {
    private Integer id;
    private String name;
    private String genre;
    private String author;
    private String age;
    private String cover;

    public Book() {

    }

    public Book(String name, String genre, String author, String age, String cover) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.age = age;
        this.cover = cover;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", cover='" + cover + '\'' +
                '}';
    }

    public static ArrayList<Book> additionOfBook(ArrayList<Book> list) {
        try  {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите имя новой книги: ");
            String name = sc.nextLine();
            System.out.print(" жанр:");
            String genre = sc.nextLine();
            System.out.print(" автора:");
            String author = sc.nextLine();
            System.out.print(" дату создания книги:");
            String age = sc.nextLine();
            System.out.print(" вид обложки:");
            String cover = sc.nextLine();
            Book book = new Book(name, genre, author, age, cover);
            list.add(book);
            SQLTableSetter.SQLTableADD(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void removeOfBook(ArrayList<Book> list) {
        try  {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название книги, которую вы хотите удалить: ");
            String name = sc.nextLine();
            Iterator<Book> iter = list.iterator();
            while (iter.hasNext()) {
                Book book = iter.next();
                if (book.getName().equals(name)) {
                    list.remove(book);
                    System.out.println("Книга с именем: " + name + " удалена.");
                }
            }
            SQLTableSetter.SQLTableADD(list);
        }catch (ConcurrentModificationException e){
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void showLibrary(ArrayList<Book> list){
        int count = 1;
        for (Book book : list) {
            System.out.println("Номер книги: " + count + ".\nНазвние книги: " + book.getName() + ".\nАвтор книги: " + book.getAuthor() + ".\nЖанр книги: " + book.getGenre() +
                    ".\nДата создания книги: " + book.getAge() + ".\nТип обложки: " + book.getCover() +"\n");
            count++;
        }
    }

    public static void showBookSpecific(ArrayList<Book> list) {
        ArrayList<Book> specificList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try  {
            System.out.println("Введите имя автора или название жанра книг, которые вы хотите увидеть: ");
            String str = sc.nextLine();
            for (Book book : list) {
                if (book.getAuthor().equals(str)){
                    specificList.add(book);
                }
                if (book.getGenre().equals(str)){
                    specificList.add(book);
                }
            }
            System.out.println("Список книг по вашему запросу: ");
            Book.showLibrary(specificList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showSortedList(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>() {
            public int compare (Book o1, Book o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Отсортированный список книг по алфавитному порядку:");
        Book.showLibrary(list);
    }

    public static ArrayList<Book> bookEditing(ArrayList<Book> list) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название книги какую вы хотите изменить: ");
            String nameOfBook = sc.nextLine();
            System.out.println("Введите название поля которое хотите изменить");
            String nameOfField = sc.nextLine();
            System.out.println("Введите новое значение");
            String newMeaning = sc.nextLine();
            for (Book book : list) {
                if (book.getName().equals(nameOfBook)) {
                    if (nameOfField.equals("name")) {
                        book.setName(newMeaning);
                    } else if (nameOfField.equals("genre")) {
                        book.setGenre(newMeaning);
                    } else if (nameOfField.equals("author")) {
                        book.setAuthor(newMeaning);
                    } else if (nameOfField.equals("age")) {
                        book.setAge(newMeaning);
                    } else if (nameOfField.equals("cover")) {
                        book.setCover(newMeaning);
                    }
                }
            }
            SQLTableSetter.SQLTableADD(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
