package toDoList;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static toDoList.ReadFile.returnItems;

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

    public static void injectItem(int id, String description){
        Connection conn = connection();
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

    public static void populateDB(String filename) {
        List<String> items = returnItems(filename);
        for (int i = 0; i < items.size(); i++) {
            injectItem(i, items.get(i));
        }
    }

    public static List<String> readItems() {
        Connection conn = connection();
        List<String> items = new ArrayList<>();
        String sql = "SELECT description FROM tasks";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String itemName = resultSet.getString("description");
                items.add(itemName);
            }
        } catch (Exception e) {
            System.out.println("Error reading items from database: " + e.getMessage());
        }

        return items;
    }

}