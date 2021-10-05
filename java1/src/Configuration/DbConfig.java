package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    public final static String DB_CONNECTION="jdbc:mysql://localhost:3306/databasedemo";
    private final static String USERNAME="root";
    private final static String PASSWORD="susan20550518";
    
    public static Connection getDbConnection(){
        //loading the driver class for database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("Error while loading the driver class");
        }
        //connecting to the database inside the DBMS
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_CONNECTION,USERNAME,PASSWORD);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
