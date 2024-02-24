package toDoList;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    int height;
    int length;
    int x;
    int y;

    public Button(String text, int height, int length, int x, int y){
        super(text);
        this.height = height;
        this.length = length;
        this.x = x;
        this.y = y;

        Font font = getFont();
        setFont(new Font(font.getFontName(),font.getStyle(), 20));

        setBounds(x,y, this.length, this.height);
    }
}
