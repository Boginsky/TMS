import java.sql.*;
import java.util.ArrayList;

public class SQLTableSetter {
    public static void SQLTableADD(ArrayList<Book> list) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/library";
        String userName = "root";
        String password = "3325";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("DELETE FROM books");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("ALTER TABLE books AUTO_INCREMENT = 1");
            preparedStatement.executeUpdate();
            try {
                preparedStatement = connection.prepareStatement("INSERT INTO books (name,genre,author,age,cover) VALUES (?,?,?,?,?)");
                for (Book book : list) {
                    preparedStatement.setString(1, book.getName());
                    preparedStatement.setString(2, book.getGenre());
                    preparedStatement.setString(3, book.getAuthor());
                    preparedStatement.setString(4, book.getAge());
                    preparedStatement.setString(5, book.getCover());
                    preparedStatement.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                preparedStatement.close();
            }
        }
    }
}