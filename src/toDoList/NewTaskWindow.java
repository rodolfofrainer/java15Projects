package toDoList;

import javax.swing.*;
import java.sql.Connection;

public class NewTaskWindow extends JFrame {
    public NewTaskWindow() {
        Connection conn = JDBC.establishConnection();
        try {
            String task = JOptionPane.showInputDialog(null, "Enter a new task");

            if (task == null) {
                System.out.println("User canceled the input dialog.");
            } else {
                System.out.println("Task entered: " + task);

                //get the largest id in the database
                int newId = JDBC.getMaxIdFromDatabase()+1;

                JDBC.injectItem(newId, task);
                }
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NewTaskWindow frame = new NewTaskWindow();
            frame.setVisible(true);
        });
    }
}
