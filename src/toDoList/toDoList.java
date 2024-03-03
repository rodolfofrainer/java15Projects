package toDoList;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

import static toDoList.JDBC.connection;
import static toDoList.JDBC.injectItem;
import static toDoList.ReadFile.returnItems;

public class toDoList {
    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 500;
    static final int PADDING = 5;
    public static void main(String[] args) {
        Connection conn = connection();
        // test item injection
//        JDBC.injectItem(conn, 1, "test");
        populateDB(conn,"listOfIdeas.txt");
        JFrame frame = createFrame();

        JPanel tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));


        frame.add(tasksPanel, BorderLayout.CENTER);



        Button addTaskButton = new Button("Add a Task", 50, 150,(FRAME_WIDTH-150)/2, 0);
        addTaskButton.addActionListener(e -> {
            newTaskWindow newTaskWindow = new newTaskWindow();
            newTaskWindow.setVisible(true);
        });
        frame.add(addTaskButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private static void populateDB(Connection conn, String filename) {
        List<String> items = returnItems(filename);
        for (int i = 0; i < items.size(); i++) {
            injectItem(conn, i, items.get(i));
        }
    }


    public static JFrame createFrame(){
        JFrame frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setVisible(true);
        return frame;
    }
}
