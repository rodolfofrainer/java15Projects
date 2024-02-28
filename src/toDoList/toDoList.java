package toDoList;

import javax.swing.*;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toDoList {
    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 500;
    static final int PADDING = 5;
    public static void main(String[] args) {
        JFrame frame = createFrame();

        JPanel tasksPanel = new JPanel();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));

        List<String> listItems = Arrays.asList(readLines("listOfIdeas.txt"));
        for (int i = 0; i < listItems.size(); i++) {
            Task newTask = new Task(i + 1, listItems.get(i));
            JTextPane textPane = new JTextPane();
            textPane.setText(newTask.getId()+"- "+newTask.getDescription());
            tasksPanel.add(textPane);
        }

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

    public static String[] readLines(String filename) {
        List<String> linesList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    linesList.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return linesList.toArray(new String[0]);
    }

    public static JFrame createFrame(){
        JFrame frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setVisible(true);
        return frame;
    }

}
