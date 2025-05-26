
import javax.swing.JOptionPane;

public class joptionpanetest{
    public static void main (String [] args){

        //String numberOne=JOptionPane.showInputDialog("Enter a Number");
        //String numberTwo=JOptionPane.showInputDialog("Enter another Number");

        //int myAge= 50;

        //int numOne=Integer.parseInt(numberOne);
        //int numTwo=Integer.parseInt(numberTwo);

        

        //System.out.println(numOne+numTwo);
        //int sum= (numOne+numTwo);

        //JOptionPane.showMessageDialog(null, "The sum of the numbers is = " + sum);

        String myAge=JOptionPane.showInputDialog("Enter your Age");
        int Age=Integer.parseInt(myAge);

        JOptionPane.showConfirmDialog(null, "Are you sure your age is" + Age);
        
        JOptionPane.showMessageDialog(null, "My Age is = " + myAge);
        



        



    }
}