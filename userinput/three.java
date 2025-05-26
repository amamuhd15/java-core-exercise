import java.util.Scanner;
public class three {
//accepts input from users to add two numbers using scanner class

    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter a number");
            int numOne = scan.nextInt();
             System.out.println("enter a number");
             int numTwo = scan.nextInt();
             int sum = numOne + numTwo;
             System.out.println("the sum of the two numbers is : " + sum);
        }

    }
}
