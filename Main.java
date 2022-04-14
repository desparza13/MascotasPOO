import javax.swing.JFrame;

import Frame.*;
import Frame.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(50, 50, 1280, 720);
        window.getContentPane().add(new Frame());
        window.setVisible(true);
    }
}
