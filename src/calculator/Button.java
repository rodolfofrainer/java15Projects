package calculator;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton{
    int gridSize;
    int buttonHeight;
    int[] position;

    public Button(String text, int gridSize, int buttonHeight, int[] position) {
        super(text);

        this.gridSize = gridSize;
        this.buttonHeight = buttonHeight*gridSize;
        this.position = position;

        Font font = getFont();
        setFont(new Font(font.getName(), font.getStyle(), 25));

        int spaceBetweenButtons = this.gridSize+Calculator.PADDING;
        if(this.position[0]!=0){
        setBounds(this.position[0]*spaceBetweenButtons+Calculator.PADDING, this.position[1]*spaceBetweenButtons, this.gridSize, this.buttonHeight);
        }else{
            setBounds(5, this.position[1]*spaceBetweenButtons, this.gridSize, this.buttonHeight);
        }
    }


}
