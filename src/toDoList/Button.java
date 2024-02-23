package toDoList;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    int height;
    int length;

    public Button(String text, int height, int length){
        super(text);
        this.height = height;
        this.length = length;
    }
}
