import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventClass {
    public static void main(String[] args) {
        
        JFrame myframe = new JFrame("this is event practical");
        myframe.setDefaultCloseOperation(myframe.EXIT_ON_CLOSE);
        myframe.setSize(400,500);

        JButton myButton = new JButton("Click to close the window");
        myButton.setPreferredSize(new Dimension(350, 100));
        myframe.add(myButton);

        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "this is my first event");
            }
        });

        myframe.setVisible(true);
    }
}
