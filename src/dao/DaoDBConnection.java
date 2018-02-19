package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public final class DaoDBConnection {

        private static DaoDBConnection instance = null;
        private static Connection connection = null;
        private final String DBNAME = "jdbc:sqlite:lib/Books.db";

        private DaoDBConnection(){
            getConnectionToDataBase();
        }

        private void getConnectionToDataBase() {
            try{
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(DBNAME);
            }catch(SQLException| NullPointerException e){
                System.out.println("DB connection problem.");
            }catch(ClassNotFoundException e){
                System.out.println("Class not found.");
            }
        }
        public static DaoDBConnection getInstance(){
            if(instance == null) instance = new DaoDBConnection();
            return instance;
        }

        public Connection getConnection(){
            return connection;
        }
    }
