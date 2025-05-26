//import java.util.*;

public class Main {
    static void myMethod(String fname){
      System.out.println(fname + " " + "hart");
    }
    
     static void myMeth(String fname, int age){
    System.out.println(fname + " " + "is" + " " + age);
  }
  
      static int myInt(int x) {
        return 5 + x;
      }
      
      static int myint(int z, int y) {
        return z + y;
      }
      
      static void checkAge(int age) {
        if(age < 18) {
          System.out.println("Access denied - you are not old enough");
        } else {
          System.out.println("Acess granted -you are old enough");
        }
      }
      
      static int plusMethodInt(int b, int c) {
        return b + c;
      }
      
      static double plusMethodDouble(double b, double c) {
        return b + c;
      }
      
      int g = 5;
      //u can add "final" so that u cant ever change the value
      
      int m;
      
      String tname = "john";
      String lname = "doe";
      int age = 34;
  
    public static void main(String[] args) {
      myMethod("john");
      myMethod("fifi");
      myMethod("henry");
      myMeth("liam", 5);
      myMeth("jenny", 7);
      myMeth("anja", 78);
      
      System.out.println(myInt(3));
      System.out.println(myint(5, 3));
      checkAge(12);
      
      int myNum1 = plusMethodInt(8, 5);
      double myNum2 = plusMethodDouble(4.3, 6.26);
      System.out.println("int:" + myNum1);
      System.out.println("double:" + myNum2);
      
      int result = sum(10);
      System.out.println(result);
      
      int score = sum(5, 10);
      System.out.println(score);
      
       Main myObj = new Main();
       System.out.println(myObj.g);
       
       Main mystf = new Main();
       mystf.m = 40;
       System.out.println(mystf.m);
       
       // you can also assign a new value to the variable 
      
      Main myname = new Main();
      System.out.println("Name:" + myname.tname + " " + myname.lname);
      System.out.println("Age:" + myname.age);
     }
     
     public static int sum(int k) {
       if (k > 0) {
         return k + sum(k-1);
       }else {
         return 0;
       }
       
     }
     
     public static int sum(int start, int end) {
       if(end > start) {
         return end + sum(start, end - 1);
       } else {
         return end;
       }
     }

}