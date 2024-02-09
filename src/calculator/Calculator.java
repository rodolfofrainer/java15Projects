package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


        Button button = new Button();
        button.setMessage("%");

        textArea.setBounds(PADDING, PADDING, WIDTH-PADDING*3, HEIGHT/8);
        button.setBounds(PADDING, PADDING, gridSize, gridSize);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

//        frame.getContentPane().add(button);
        frame.getContentPane().add(textArea);
        frame.setVisible(true);
    }
}
