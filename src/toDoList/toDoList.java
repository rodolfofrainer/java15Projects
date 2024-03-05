package toDoList;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static toDoList.JDBC.getItemsFromDatabase;

public class toDoList {
    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 500;
    static final int PADDING = 5;
    public static void main(String[] args) {
        // item injection
       // JDBC.injectItem(conn, 1, "test");

        //populate DB with all items in txt file
//        JDBC.populateDB("listOfIdeas.txt");

        JFrame frame = createFrame();

        JPanel tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));

        frame.add(tasksPanel, BorderLayout.CENTER);

        // read all items in DB and return as a list
        populateJPanel(tasksPanel);


        Button addTaskButton = new Button("Add a Task", 50, 150,(FRAME_WIDTH-150)/2, 0);
        addTaskButton.addActionListener(e -> {
            NewTaskWindow newTaskWindow = new NewTaskWindow();
            newTaskWindow.setVisible(true);
            newTaskWindow.dispose();
            populateJPanel(tasksPanel);
            frame.pack();
        });
        frame.add(addTaskButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private static void populateJPanel(JPanel tasksPanel) {
        tasksPanel.removeAll(); // Clear existing components
        List<Task> items = getItemsFromDatabase();
        for (Task currentItem : items) {
            TaskPanel taskPanel = new TaskPanel(currentItem);
            taskPanel.getCheckBox().setSelected(currentItem.getCompleted());
            tasksPanel.add(taskPanel);
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
