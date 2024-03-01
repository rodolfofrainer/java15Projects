package toDoList;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JdbcConfig {
    private String username;
    private String password;

    public JdbcConfig() {
        try (FileInputStream input = new FileInputStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}