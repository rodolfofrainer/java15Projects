package toDoList;

import javax.swing.*;
import java.awt.*;

import static toDoList.toDoList.populateJPanel;

public class TaskPanel extends JPanel {
    private final JCheckBox checkBox;
    private final JButton button;
    private final JPanel tasksPanel;

    public TaskPanel(Task task, JPanel tasksPanel) {
        this.tasksPanel = tasksPanel;

        checkBox = new JCheckBox();
        JLabel descriptionLabel = new JLabel(task.getDescription());
        JLabel taskId = new JLabel(String.valueOf(task.getId()));

        button = new JButton("X");
        button.setPreferredSize(new Dimension(80, 20));

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(taskId);
        add(checkBox);
        add(descriptionLabel);
        add(button);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        button.addActionListener(e -> {
            JDBC.deleteSingleItem(task);
            tasksPanel.removeAll();
            populateJPanel(tasksPanel);
            tasksPanel.revalidate();
            tasksPanel.repaint();
        });

    }

    public JCheckBox getCheckBox() {
        return checkBox;
    }
}
