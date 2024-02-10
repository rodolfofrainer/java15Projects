package calculator;

import javax.swing.*;

public class Calculator {
    final static int PADDING = 5;
    final static int WIDTH = 420 + PADDING*2;
    final static int HEIGHT = 600 + PADDING*2;
    final static int gridSize = 100;
    public static void main(String[] args) {

        JFrame frame = createFrame();

        JTextArea textArea = createTextArea();

        Button divisonButton = new Button("÷", gridSize, 1, new int[]{0, 1});
        Button multiplicationButton = new Button("X", gridSize, 1, new int[]{1, 1});
        Button minusButton = new Button("-", gridSize, 1, new int[]{2, 1});
        Button plussButton = new Button("+", gridSize, 1, new int[]{3, 1});
        Button equalButton = new Button("=", gridSize, 4, new int[]{3, 2});


        frame.getContentPane().add(divisonButton);
        frame.getContentPane().add(multiplicationButton);
        frame.getContentPane().add(minusButton);
        frame.getContentPane().add(plussButton);
        frame.getContentPane().add(equalButton);
        frame.getContentPane().add(textArea);
        frame.setVisible(true);


        divisonButton.addActionListener(e -> textArea.append(divisonButton.getText()));
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+PADDING*2,HEIGHT+PADDING*2);
        frame.setLayout(null);
        return frame;
    }

    private static JTextArea createTextArea() {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(PADDING, PADDING, WIDTH-PADDING*3, gridSize-PADDING);
        return textArea;
    }
}
