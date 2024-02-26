package toDoList;

import javax.swing.*;

public class newTaskWindow extends JFrame{
    public void NewTaskWindow() {
        setTitle("New Window");
        setSize(300, 100);

        JTextArea label = new JTextArea();

        JPanel panel = new JPanel();
        panel.add(label);
        add(panel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
