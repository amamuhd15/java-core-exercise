public class array {
    public static void main (String[] args){
       //array
        int[] ages = {3, 4, 7, 28, 54};
        System.out.println(ages);
  
         int[] myAges = new int[5];
  
        myAges[0]= 3;
        myAges[1]= 4;
        myAges[2]= 5;
        myAges[3]= 6;
        myAges[4]= 7;
  
       
  
        System.out.println(myAges[2]);
        
        int[][] myArray = new int[5][5];
            myArray[0][0] = 20;
            myArray[1][1] = 40;
            myArray[2][2] = 60;
            myArray[3][3] = 70;
            myArray[4][4] = 30;
            
       System.out.println(myArray[0][0]) ;
        
        String[] names = new String[5];
         names[0] = "ama";
          names[1] = "ted";
           names[2] = "ned";
            names[3] = "dre";
             names[4] = "bri";
            
             System.out.println(names[3]);
      }
}
