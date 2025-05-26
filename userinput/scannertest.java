 import java.util.Scanner;
public class scannertest {
    public static void main(String[] args){
        try (Scanner dd = new Scanner(System.in)) {
            System.out.println("Enter your first name");
            String fname= dd.nextLine();
            System.out.println("enter your last name");
              String lname = dd.nextLine();
            String fullname = fname + " " + lname;
            System.out.println(fullname);
        }
        int num = 0;
        while(num <= 10){
            System.out.println("hello world");
            num++;
        }
        int first = 0;
         int second = 2;
         while(first <= 10){
            System.out.println(second+"*"+first+"is"+(first*second));
            first++;
         }
         //vscode made me put this try keyword
         try (Scanner nn = new Scanner(System.in)) {
            int numfirst = 1;
             System.out.println("please insert an integer");
             int numsecond = nn.nextInt();
             while(numfirst <= 10){
                System.out.println(numsecond+"*"+numfirst+"is = "+(numfirst*numsecond));
                numfirst++;
             }
        }
    }



    
}
