package toDoList;

import javax.swing.*;
import java.awt.*;

public class TaskPanel extends JPanel {
    private final Task task;
    private final JCheckBox checkBox;
    private final JLabel descriptionLabel;

    public TaskPanel(Task task) {
        this.task = task;
        checkBox = new JCheckBox();
        descriptionLabel = new JLabel(task.getDescription());

        setLayout(new BorderLayout());
        add(checkBox, BorderLayout.WEST);
        add(descriptionLabel, BorderLayout.CENTER);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public Task getTask() {
        return task;
    }

    public JCheckBox getCheckBox() {
        return checkBox;
    }
    private Font descriptionFont;

    public Font getDescriptionFont() {
        return descriptionFont;
    }

    public void setDescriptionFont(Font descriptionFont) {
        this.descriptionFont = descriptionFont;
    }
}
