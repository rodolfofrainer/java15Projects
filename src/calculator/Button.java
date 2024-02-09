package calculator;

import javax.swing.*;

public class Button extends JButton{
    String message;
    int gridSize;

    public int getGridSize() {
        return gridSize;
    }


    public String getMessage() {
        return message;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
        //setBounds(x,y,size,size);
    }
    public void setMessage(String message) {
        this.message = message;
        setText(message);
    }

}
