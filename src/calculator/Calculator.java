package calculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    final static int PADDING = 5;
    final static int WIDTH = 425 + PADDING*2;
    final static int HEIGHT = 650 + PADDING*3;
    final static int GRID_SIZE = 100;
    public static void main(String[] args) {

        JFrame frame = createFrame();

        JTextArea textArea = createTextArea();
        frame.getContentPane().add(textArea);
        frame.setVisible(true);

        ArrayList<Button> buttons = populateButtons();
        for(Button button:buttons){
        frame.getContentPane().add(button);
        button.addActionListener(e -> textArea.append(button.getText()));
        }

    }


    private static ArrayList<Button> populateButtons() {
        //Create array with app buttons
        ArrayList<Button> buttons = new ArrayList<>();
        List<String> buttonsLabels = Arrays.asList("÷", "x","-","7","8","9","4","5","6","1","2","3","=","+","+/-", "0",".");

        int numRows = (int) Math.ceil((double) buttonsLabels.size() / 3);
        for (int i = 0; i < buttonsLabels.size(); i++) {
            int row = i / 3;
            int col = i % 3;

            // Adjust the indices for special buttons
            if (i >= buttonsLabels.size() - 3) {
                row = numRows - 2;
                col = i - (buttonsLabels.size() - 3);
            }

            if (buttonsLabels.get(i).equals("=")) {
                buttons.add(new Button("=", GRID_SIZE, 4, new int[]{3,2}));
            } else if (buttonsLabels.get(i).equals("+")) {
                buttons.add(new Button("+", GRID_SIZE, 1, new int[]{3,1}));
            } else {
                buttons.add(new Button(buttonsLabels.get(i), GRID_SIZE, 1, new int[]{col, row+1}));
            }
        }

        return buttons;
    }

    private static JFrame createFrame() {
        //Create app window
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+PADDING*2,HEIGHT+PADDING*2);
        frame.setLayout(null);
        return frame;
    }

    private static JTextArea createTextArea() {
        //Create app white bar for input
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(PADDING, PADDING, WIDTH-PADDING*3, GRID_SIZE -PADDING);
        return textArea;
    }
}
