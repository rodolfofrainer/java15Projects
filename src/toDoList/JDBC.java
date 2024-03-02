package toDoList;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static void connection() {
        JdbcConfig config = new JdbcConfig();
        String username = config.getUsername();
        String password = config.getPassword();
        String url = "jdbc:mysql://localhost:3306/tasks";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}