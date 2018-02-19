package dao;

import model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        preparedStatement.setString(5, String.valueOf(book.getProductionYear())));

        return preparedStatement.executeUpdate();
    }

    }
}
