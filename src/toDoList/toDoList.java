package toDoList;

import javax.swing.*;
import java.awt.*;

import static toDoList.JDBC.readItems;

public class toDoList {
    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 500;
    static final int PADDING = 5;
    public static void main(String[] args) {
        // test item injection
       // JDBC.injectItem(conn, 1, "test");
//        JDBC.populateDB("listOfIdeas.txt");
        readItems();
        JFrame frame = createFrame();

        System.out.println(readItems());

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




    public static JFrame createFrame(){
        JFrame frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setVisible(true);
        return frame;
    }
}
