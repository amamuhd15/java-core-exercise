//
//import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        //repeats hello world ten times
        /*int num = 0;
        while(num <= 10){
            System.out.println("hello world");
            num++;
         } */



         //does the 2x table upto no.10
         /*int first = 0;
         int second = 2;
         while(first <= 10){
            System.out.println(second+"*"+first+"is"+(first*second));
            first++;
         }*/

         

         //accepts input from the user to do the same as the code above
          /*Scanner nn = new Scanner(System.in);
         int numfirst = 1;
         System.out.println("please insert an integer");
         int numsecond = nn.nextInt();
         while(numfirst <= 10){
            System.out.println(numsecond+"*"+numfirst+"is = "+(numfirst*numsecond));
            numfirst++;
         }*/

         //DO WHILE SYNTAX
         /*Scanner dd = new Scanner(System.in);
         int numone = 1;
         System.out.println("please insert an integer");
         int numtwo = dd.nextInt();
        do{
        System.out.println(numtwo+"*"+numone+"is = "+(numone*numtwo));
        numone++;
        }while(numone <= 10);*/

        //for(int i = 0; i <= 20; i++){
            //System.out.println(i);
        //}

        //addition of numbers from 1 to 7
        /*int sum = 0;
        for(int v =0; v <= 7; v++){
            sum +=v;
        System.out.println(sum);
        }*/

            //multiplication of  numbers from 1 to 7
           /*  int result = 1;
            for(int s =1; s <= 7; s++){
                result *=s;
                System.out.println(result);
            }*/
            
            //using the if and else structure
            /*int numOne = 10;
            if(numOne == 7){
                System.out.println("the value of numOne is 7");
            }else{
                 System.out.println("the value of num one is not equal to seven");
            }*/

           /* int numTwo = 2;
            if(numTwo == 1){
                System.out.println("the value of numOne is 1");
            }else if(numTwo == 2){
                 System.out.println("the value of numOne is 2");
            }else if(numTwo == 10){
                 System.out.println("the value of numOne is 10");
            }*/ 

       
        /*char grade = 'A';
        switch(grade){
            case 'C':
            System.out.println("your grade is C");
            break;

            case 'B':
            System.out.println("your grade is B");
            break;

            case 'A':
            System.out.println("your grade is A");
            break;

            default:
            System.out.println("no grades to match your search");

        }*/

        /*Scanner nn = new Scanner(System.in);
        System.out.println("enter a grade");
        char score = nn.next().charAt(0);
        switch(score){
            case 'C':
            System.out.println("your grade is C");
            break;

            case 'B':
            System.out.println("your grade is B");
            break;

            case 'A':
            System.out.println("your grade is A");
            break;

            default:
            System.out.println("no grades to match your search");

        }*/
    }
}