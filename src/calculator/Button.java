package calculator;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton{
    int gridSize;
    int height;
    int[] position;

    public Button(String text, int gridSize, int height, int[] position) {
        super(text);

        this.gridSize = gridSize;
        this.height = height;
        this.position = position;

        Font font = getFont();
        setFont(new Font(font.getName(), font.getStyle(), 25));

        int buttonSpacing = this.gridSize+Calculator.PADDING;
        int buttonHeight = height*gridSize;
        if(this.position[0]!=0){
        setBounds(this.position[0]*buttonSpacing+Calculator.PADDING, this.position[1]*buttonSpacing, buttonSpacing, buttonHeight+Calculator.PADDING*height);
        }else{
            setBounds(5, this.position[1]*buttonSpacing, buttonSpacing, buttonHeight+Calculator.PADDING*height);
        }
    }


}
