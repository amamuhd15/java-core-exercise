public class method {
    public static void main(String[] args){
      //declaring mehods
          method ms = new method();
        ms.greetMe();

        int result = addition(23, 45);
         System.out.println( "the result is : " + result);

         //calls the method max
        int num1 = 3;
        int num2 = 5;
        int big = max(num1,num2);
        System.out.println("the maximum between " + num1 + "and " + num2 + "is " + big);
    }

    //this method does not return a value
    public void greetMe(){
        System.out.println("good day bitches");
    }

    //this method returns a value
    public static int addition(int a, int b){
        return a + b;

    }

    //returns the value of the maximum number
    public static int max(int num1, int num2){
        int big;
       
        if (num1 > num2)
            big = num1;
            else
            big = num2;
            return big;
    }

    
}
