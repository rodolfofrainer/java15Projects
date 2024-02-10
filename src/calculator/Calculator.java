package calculator;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        final int PADDING = 5;
        final int WIDTH = 400;
        final int HEIGHT = 400;
        final int gridSize = 100;
        JFrame frame = new JFrame("To do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+PADDING*2,HEIGHT+PADDING*2);
        frame.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);


        Button button = new Button("/", gridSize, 1, new int[]{PADDING, HEIGHT/9+ PADDING*2});
        button.setBounds();

        textArea.setBounds(PADDING, PADDING, WIDTH-PADDING*3, HEIGHT/9);

        button.addActionListener(e -> textArea.append(button.getText()));

        frame.getContentPane().add(button);
        frame.getContentPane().add(textArea);
        frame.setVisible(true);
    }
}
