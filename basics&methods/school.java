public class school {

   
    public static void main(String[] args){
        for(int i = 1; i <= 2; i++){
            System.out.println("This is the " + i + "st loop");

            for(int j = 1; j <=3; j++){
                System.out.print("The value of J is: " + j);
            }

        }    
            
            myMethod("Liam", 5);
            myMethod("jenny", 6);

            System.out.println(Stuff(3));

            int z = addition(7, 8);
            System.out.println("Addition result: " + z);

            int myNum1 = plusmethod(8, 5);
            double myNum2 = plusmethod(4.5, 5.5);
            System.out.println("int: " + myNum1);
            System.out.println("double: " + myNum2);
        
    }

    static void myMethod(String fname, int age){
        System.out.println(fname + "reed " + "is " + age);
    }

    static int Stuff(int x){
        return 5 + x;
    }

    static int addition(int y, int j){
        return y + j;
    }

    static int plusmethod(int g, int f){
        return g + f;
    }

    static double plusmethod(double g, double f){
        return g + f;
    }
}
