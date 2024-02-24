package toDoList;

import javax.swing.*;

public class toDoList {
    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 500;
    public static void main(String[] args) {
        JFrame frame = createFrame();


        Button addTask = new Button("Add a Task", 50, 150,(FRAME_WIDTH+100)/3, 0);
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

    // add button to add new task

    // add task (with remove and edit button)

}
