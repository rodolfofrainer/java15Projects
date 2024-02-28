package toDoList;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class newTaskWindow extends JFrame {
    public newTaskWindow() {
        int width = 600;
        int height = 150;
        setTitle("New Window");
        setSize(width, height);

        JPanel panel = new JPanel(new BorderLayout());
        JTextPane label = new JTextPane();
        StyledDocument doc = label.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 20));

        panel.add(label, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        Button addTaskButton = new Button("Add task", width, width, width, height);
        panel.add(addTaskButton, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            newTaskWindow frame = new newTaskWindow();
            frame.setVisible(true);
        });
    }
}
