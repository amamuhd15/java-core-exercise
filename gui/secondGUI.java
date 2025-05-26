import javax.swing.*;
import java.awt.*;

public class secondGUI {
    
    public static void main(String[] args) {
        
    
    JFrame jf = new JFrame("COS 202");

    JPanel jp = new JPanel();
    jp.setPreferredSize(new Dimension(500,400));

    jp.setBackground(Color.gray);


    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jf.add(jp);
    
    jf.pack();

    jf.setVisible(true);

    }
}
