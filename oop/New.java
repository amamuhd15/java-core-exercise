public class New {
    public static int myPower(int base, int pow){
        if (pow == 0){
            return 1;
        }else{
            return base * myPower(base, pow -1);
        }
    }
    public static void main(String [] args){
        int result = myPower(4, 6);
        System.out.println(result);
    }
}
