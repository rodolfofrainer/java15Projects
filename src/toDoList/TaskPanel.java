package toDoList;

import javax.swing.*;
import java.awt.*;

import static toDoList.toDoList.populateJPanel;

public class TaskPanel extends JPanel {
    private final JCheckBox checkBox;

    public TaskPanel(Task task, JPanel tasksPanel) {
        setLayout(new BorderLayout());

        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel descriptionLabel = new JLabel(task.getDescription());
        checkBox = new JCheckBox();

        JLabel taskId = new JLabel(String.valueOf(task.getId()));
        infoPanel.add(taskId);
        infoPanel.add(checkBox);
        infoPanel.add(descriptionLabel);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton deleteButton = new JButton("X");
        deleteButton.setPreferredSize(new Dimension(50, 20));

        buttonPanel.add(deleteButton);

        add(infoPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        deleteButton.addActionListener(e -> {
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
