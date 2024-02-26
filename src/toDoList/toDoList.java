package toDoList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class toDoList {
    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 500;
    static final int PADDING = 5;
    public static void main(String[] args) {
        JFrame frame = createFrame();


    // add button to add new task
        Button addTask = new Button("Add a Task", 50, 150,(FRAME_WIDTH-150)/2, 0);
        addTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newTaskWindow newTaskWindow = new newTaskWindow();
                newTaskWindow.setVisible(true);
            }
        });
        frame.add(addTask);
    }


    public static JFrame createFrame(){
        JFrame frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setVisible(true);
        return frame;
    }



    //################## PSEUDOCODE
    // possible authentication (?)

    // add db connection

    // add task (with remove and edit button)

}
