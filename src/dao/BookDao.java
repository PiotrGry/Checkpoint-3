package dao;

import model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao{
    private DaoDBConnection dbConnection = DaoDBConnection.getInstance();
    private Connection connection = null;

    public BookDao(){
        connection = dbConnection.getConnection();
    }

    public int insertBook(Book book) throws SQLException{

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Books " +
                "(IBSN, author, title,  publisher, production_year, price, type)" +
                "VALUES(?,?,?,?,?,?,?)");

        preparedStatement.setString(1, String.valueOf(book.getBookIBSN()));
        preparedStatement.setInt(2, Integer.parseInt(book.getBookAuthor()));
        preparedStatement.setInt(3, Integer.parseInt(book.getBookTitle()));
        preparedStatement.setString(4, book.getPublisher());
        preparedStatement.setString(5, String.valueOf(book.getProductionYear()));

        return preparedStatement.executeUpdate();
    }

    public List<Book> showAllBooks()throws SQLException{
        List<Book> books = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(
                                            "select ibsn, Authors.name||' '|| Authors.surname as  author,  " +
                                                    "title, publisher, production_year, price, TypeBook.type as type " +
                                                    "from Books " +
                                                    "inner join Authors on Books.author = Authors.autor_id " +
                                                    "inner join TypeBook on Books.type= TypeBook.type_id;");

        ResultSet queryResult = preparedStatement.executeQuery();
        while(queryResult.next()){
            int ibsn = (queryResult.getInt("IBSN"));
            String bookAuthor = queryResult.getString("author");
            String bookTitle = queryResult.getString("title");
            String bookPublisher = queryResult.getString("publisher");
            int bookProductionYera = Integer.parseInt(queryResult.getString("production_year"));
            float bookPrice = queryResult.getFloat("price");
            String bookType = queryResult.getString("type");

            Book book = new Book(ibsn, bookTitle, bookAuthor,
                                bookPublisher, bookProductionYera,
                                bookPrice, bookType );

            books.add(book);
        }
        return books;


    }
}
