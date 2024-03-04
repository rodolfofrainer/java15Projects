package toDoList;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JdbcConfig {
    private String username;
    private String password;
    private String dbName;

    public JdbcConfig() {
        try (FileInputStream input = new FileInputStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
            dbName = properties.getProperty("db.name");
        } catch (IOException e) {
            System.out.println("Error loading properties file:"+ e.getMessage());
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDbName() {
        return dbName;
    }
}