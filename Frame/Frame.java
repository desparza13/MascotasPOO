package Frame;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.PLAIN;

public class Frame extends JComponent{
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Image pouTest = Toolkit.getDefaultToolkit().getImage( "..\\Assets\\pou.jpg");
        g2d.drawImage(pouTest, 0, 0, this);
    }
}
