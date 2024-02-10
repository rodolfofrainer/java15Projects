package calculator;

import javax.swing.*;

public class Button extends JButton{
    int gridSize;
    int buttonHeight;
    int[] position;

    public Button(String text, int gridSize, int buttonHeight, int[] position) {
        super(text);
        this.gridSize = gridSize;
        this.buttonHeight = buttonHeight*gridSize;
        this.position = position;
    }

    public void setBounds(){
        setBounds(this.position[0], this.position[1], this.gridSize, this.buttonHeight);
    }
}
