package toDoList;

import javax.swing.*;

public class toDoList {
    public static void main(String[] args) {
        JFrame frame = createFrame();

    }


    public static JFrame createFrame(){
        JFrame frame = new JFrame("To-do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        return frame;
    }
 

    //################## PSEUDOCODE
    // possible authentication (?)

    // add db connection

    // add button to add new task

    // add task (with remove and edit button)

}
