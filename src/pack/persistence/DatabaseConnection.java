package pack.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection conn=null;
    private DatabaseConnection()
    {
        String url = "jdbc:mysql:// localhost:3306/TPVik";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        if (conn == null) {
            new DatabaseConnection();
        }
        return conn;
    }
}