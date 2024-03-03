package toDoList;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class JDBC {
    public static Connection connection() {
        JdbcConfig config = new JdbcConfig();
        String username = config.getUsername();
        String password = config.getPassword();
        String url = "jdbc:mysql://localhost:3306/tasks";
        Connection conn = null;
        try {
            System.out.println("Connected to data base");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Connection failed!");
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void injectItem(Connection conn, int id,String description){
        LocalDate currentDate = LocalDate.now();
        Date sqlDate = Date.valueOf(currentDate);
        String InsertTask = "INSERT INTO tasks (id, completed, dateCreated, description) VALUES(?,?,?,?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(InsertTask)) {

            preparedStatement.setString(1, String.valueOf(id));
            preparedStatement.setString(2, "0");
            preparedStatement.setDate(3, sqlDate);
            preparedStatement.setString(4, description);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Task inserted successfully!");
            } else {
                System.out.println("Failed to insert task.");
            }
        } catch (Exception e) {
            System.out.println("Error inserting task: " + e.getMessage());
        }

    }

}