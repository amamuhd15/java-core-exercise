import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MathEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Basic Math Operation Event");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 400));

        JLabel label = new JLabel("First Input");
        panel.add(label);
        JTextField myText = new JTextField(15);
        panel.add(myText);
        

        JLabel label2 = new JLabel("second Input");
        panel.add(label2);       
        JTextField myText2 = new JTextField(15);
        panel.add(myText2);       
        

        JLabel Result = new JLabel("the result is : "  );     
        panel.add(Result);
        //JTextField myResult = new JTextField(15);
        //panel.add(myResult);

        JButton AddButton = new JButton("add");
        panel.add(AddButton);

        JButton SubtractButton = new JButton("subtract");
        panel.add(SubtractButton);

        JButton DivideButton = new JButton("Divide");
        panel.add(DivideButton);

        JButton MultiplyButton = new JButton("Multiply");
        panel.add(MultiplyButton);

        //adding an event
        AddButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int numOne = Integer.parseInt(myText. getText());
                int numTwo = Integer.parseInt(myText2.getText());
                int result = numOne + numTwo;

                Result.setText(String.valueOf(result));
            }
        });

        SubtractButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int numOne = Integer.parseInt(myText. getText());
                int numTwo = Integer.parseInt(myText2.getText());
                int result = numOne - numTwo;

                Result.setText(String.valueOf(result));

            }
        });

        DivideButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int numOne = Integer.parseInt(myText. getText());
                int numTwo = Integer.parseInt(myText2.getText());
                int result = numOne / numTwo;

                Result.setText(String.valueOf(result));

            }
        });

        MultiplyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int numOne = Integer.parseInt(myText. getText());
                int numTwo = Integer.parseInt(myText2.getText());
                int result = numOne * numTwo;

                Result.setText(String.valueOf(result));

            }
        });

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
