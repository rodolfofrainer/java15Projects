package toDoList;

import javax.swing.*;
import java.awt.*;

public class TaskPanel extends JPanel {
    private final JCheckBox checkBox;

    public TaskPanel(Task task) {
        checkBox = new JCheckBox();
        JLabel descriptionLabel = new JLabel(task.getDescription());
        JLabel taskId = new JLabel(String.valueOf(task.getId())+": " );

        setLayout(new BorderLayout());
        add(taskId, BorderLayout.WEST);
        add(checkBox, BorderLayout.EAST);
        add(descriptionLabel, BorderLayout.CENTER);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public JCheckBox getCheckBox() {
        return checkBox;
    }
}
