package lesson17.task1;

public class Book {
    private String name;
    private String genre;
    private String author;
    private String age;
    private String cover;
    private boolean takeHome;

    public Book() {
    }

    public Book(String name, String genre, String author, String age, String cover, boolean takeHome) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.age = age;
        this.cover = cover;
        this.takeHome = takeHome;
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

    public boolean isTakeHome() {
        return takeHome;
    }

    public void setTakeHome(boolean takeHome) {
        this.takeHome = takeHome;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", cover='" + cover + '\'' +
                ", takeHome=" + takeHome +
                '}';
    }

    boolean isVisiterRoomOnly(){
        return takeHome;
    }
}
