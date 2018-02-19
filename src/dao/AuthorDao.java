package dao;

import java.sql.Connection;

public class AuthorDao{
    private DaoDBConnection dbConnection = DaoDBConnection.getInstance();
    private Connection connection = null;

    public AuthorDao(){
        connection = dbConnection.getConnection();
    }



}
