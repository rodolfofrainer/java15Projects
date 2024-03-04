package toDoList;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static toDoList.ReadFile.returnItems;

public class JDBC {
    public static Connection establishConnection() {
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
        Connection conn = establishConnection();
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

    public static List<Task> getItemsFromDatabase() {
        Connection connection = establishConnection();
        List<Task> tasks = new ArrayList<>();
        String query = "SELECT id, completed, dateCreated, description FROM tasks";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                boolean completed = resultSet.getBoolean("completed");
                String dateCreated = resultSet.getString("dateCreated");
                String description = resultSet.getString("description");

                Task task = new Task(id, completed, description, dateCreated);
                task.setCompleted(completed);
                tasks.add(task);
            }
        } catch (SQLException ex) {
            System.out.println("Error reading items from database: " + ex.getMessage());
        }

        return tasks;
    }

}