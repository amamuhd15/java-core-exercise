import java.awt.*;
import  javax.swing.*;
public class thirdGUI{
    public static void main(String[] args){
       JFrame jaf = new JFrame("practical");

       JPanel jap = new JPanel();
       JPanel jap1 = new JPanel();
       JPanel jap2 = new JPanel();

       jap.setPreferredSize(new Dimension(900,600));
       jap1.setPreferredSize(new Dimension(200,400));
       jap2.setPreferredSize(new Dimension(200,400));

       jap.setBackground(Color.gray);
       jap1.setBackground(Color.blue);
       jap2.setBackground(Color.black);

       JLabel jal1 = new JLabel("one");
       JLabel jal2 = new JLabel("two");
       //adding panel to frame 
       
       jap1.add(jal1);
       jap2.add(jal2);

        jaf.setLayout(new BorderLayout());
        jap.add(jap1);
        jap.add(jap2);
        jaf.add(jap);

        jaf.pack();
        jaf.setVisible(true);
        jaf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
}
}