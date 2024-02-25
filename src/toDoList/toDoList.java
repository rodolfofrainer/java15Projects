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
        Button addTask = new Button("Add a Task", 50, 150,(FRAME_WIDTH+100)/3, 0);
        addTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewWindow newTaskWindow = new NewWindow();
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

    static class NewWindow extends JFrame{
        public NewWindow() {
            setTitle("New Window");
            setSize(300, 200);

            JTextArea label = new JTextArea();

            JPanel panel = new JPanel();
            panel.add(label);
            add(panel);

            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
        }
    }


    //################## PSEUDOCODE
    // possible authentication (?)

    // add db connection

    // add task (with remove and edit button)

}
