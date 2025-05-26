import java.awt.*;
import javax.swing.*;
public class GImage{
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("gui image practical");
        ImageIcon img = new ImageIcon("emoji.jpg");
        JLabel myLabel = new JLabel(img, JLabel.CENTER);

        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,500);
        myFrame.add(myLabel);
        myFrame.setVisible(true);
    }
}