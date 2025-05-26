public class recursion {
    
    public static int myFactorial(int n){
        if (n==1){
            return 1;
        }else{
            return n *myFactorial(n - 1);
        }

    }

     public static void main(String [] args){
        int result = myFactorial(5);
        System.out.println(result);
    }
}
