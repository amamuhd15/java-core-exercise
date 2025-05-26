import java.awt.*;
import javax.swing.*;
public class GImage2 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("GUI image practical");
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,500);
        myFrame.setVisible(true);


         JPanel myPanel = new JPanel();
        JPanel myPanel2 = new JPanel();

        myPanel.setPreferredSize(new Dimension(200, 400));
        myPanel2.setPreferredSize(new Dimension(200, 400));

        ImageIcon myImage = new ImageIcon("emoji.jpg");
        ImageIcon myImage2 = new ImageIcon("emoji2.jpg");

        JLabel myLabel = new JLabel(myImage, JLabel.LEFT);
        JLabel myLabel2 = new JLabel(myImage2, JLabel.RIGHT);

        myPanel.add(myLabel);
        myPanel2.add(myLabel2);

        myFrame.add(myLabel);
        myFrame.add(myLabel2);
        myFrame.setLayout(new GridLayout(1, 2));
        myFrame.setVisible(true);

    }
}
