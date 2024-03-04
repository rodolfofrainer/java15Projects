package toDoList;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static toDoList.ReadFile.returnItems;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/";

    public static Connection establishConnection() {
        JdbcConfig config = new JdbcConfig();
        String dbName = config.getDbName();
        String username = config.getUsername();
        String password = config.getPassword();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL+dbName, username, password);
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void injectItem(int id, String description) {
        try (Connection conn = establishConnection()) {
            if (conn != null) {
                LocalDate currentDate = LocalDate.now();
                Date sqlDate = Date.valueOf(currentDate);
                String insertTask = "INSERT INTO tasks (id, completed, dateCreated, description) VALUES(?,?,?,?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(insertTask)) {
                    preparedStatement.setInt(1, id);
                    preparedStatement.setBoolean(2, false);
                    preparedStatement.setDate(3, sqlDate);
                    preparedStatement.setString(4, description);

                    int rowsAffected = preparedStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Task inserted successfully!");
                    } else {
                        System.out.println("Failed to insert task.");
                    }
                }
            } else {
                System.out.println("Failed to establish connection to the database.");
            }
        } catch (SQLException e) {
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
        List<Task> tasks = new ArrayList<>();
        try (Connection connection = establishConnection()) {
            if (connection != null) {
                String query = "SELECT id, completed, dateCreated, description FROM tasks";
                try (PreparedStatement statement = connection.prepareStatement(query)) {
                    ResultSet resultSet = statement.executeQuery();
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        boolean completed = resultSet.getBoolean("completed");
                        Date dateCreated = resultSet.getDate("dateCreated");
                        String description = resultSet.getString("description");

                        Task task = new Task(id, completed, description, dateCreated.toString());
                        tasks.add(task);
                    }
                }
            } else {
                System.out.println("Failed to establish connection to the database.");
            }
        } catch (SQLException ex) {
            System.out.println("Error reading items from database: " + ex.getMessage());
        }
        return tasks;
    }

    public static void updateCompletedStatusInDatabase(int id, boolean completed) {
        try (Connection connection = establishConnection()) {
            if (connection != null) {
                String updateQuery = "UPDATE tasks SET completed = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                    preparedStatement.setBoolean(1, completed);
                    preparedStatement.setInt(2, id);
                    int rowsAffected = preparedStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Task completion status updated successfully in the database!");
                    } else {
                        System.out.println("Failed to update task completion status in the database.");
                    }
                }
            } else {
                System.out.println("Failed to establish connection to the database.");
            }
        } catch (SQLException ex) {
            System.out.println("Error updating task completion status in the database: " + ex.getMessage());
        }
    }

    public static int getMaxIdFromDatabase() {
        try (Connection connection = establishConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT MAX(id) AS max_id FROM tasks");
             ResultSet resultSet = statement.executeQuery()) {
            return resultSet.next() ? resultSet.getInt("max_id") : 0;
        } catch (SQLException ex) {
            System.out.println("Error retrieving max ID from database: " + ex.getMessage());
            return 0;
        }
    }
}