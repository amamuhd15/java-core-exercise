public class conditions {
  int a;
  int b;

   public static void main(String[] args) {
  System.out.println(1);
  System.out.println("i am very smart");
  
  int a = 10;
  int b = 6;
  int x = a + b;
  System.out.println(x);
  
   int y = 3;
   int d = y++;
  System.out.println(d);
  
  int myInt = 9;
  double myDouble = myInt;
  System.out.println("the integer form is:" + myInt);
  System.out.println(myDouble);
  
  double twice = 9.78d;
  int thrice = (int) twice;
  System.out.println(twice);
  System.out.println(thrice);
  
  String txt = "qwertyuiopasdfghjkl";
  System.out.println("the length of the string is:" + txt.length()); 
  
  //int randonNum = (int)(Math.random() * 101);
 // System.out.println(randomNum);
 
 int myAge = 16;
 int votingAge = 18;
 
 if (myAge >= votingAge){
   System.out.println("old enough to vote!");
 } else{
   System.out.println("not old enough to vote");
 }
 
  int time = 10;
  String result;
  result = (time < 18) ? "good day." : "good evening.";
  System.out.println(result);
  //this is is shorter version of the if and else ClassNotFoundException
  
  int day = 4;
  switch (day) {
    case 1:
      System.out.println("monday");
      break;
    case 2:
      System.out.println("tuesday");
      break;
    case 3:
      System.out.println("wednesday");
      break;
    case 4:
      System.out.println("thursday");
      break;
      }
    
  int i = 0;
  do{
    System.out.println(i);
    i++;
  }
   
  while(i < 5);
  
  for (int v = 0; v < 5; v++){
    System.out.println(v);//this is the short form of the previous code to iterate a given range
  }
  
  for (int c = 1; c <= 2; c++) {
    System.out.println("outer:" + c);
    
    for (int j = 1; j <= 3; j++) {
      System.out.println("inner:" + j);
    }
  }
  
  for (int f = 0; f < 10; f++){
    if (f == 4) {
      break;
    }
    System.out.println(f);
  }
  
  
  for (int s = 0; s < 10; s++){
    if (s == 4) {
      continue;
    }
    System.out.println(s);
  }
  
  String[] cars = {"volvo", "bmw", "ford", "rolsroyce"};
  for (int r = 0; r < cars.length; r++){
    System.out.println(cars[r]);
  }
  
  int[][] mynumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  for(int n = 0; n < mynumbers.length; n++) {
    for (int k = 0; k < mynumbers[n].length; k++) {
      System.out.println(mynumbers[n][k]);
    }
  }
  
  int[][] myOutput = { {1, 2, 3, 4}, {5, 6, 7,} };
  myOutput[1][1] = 9;
  System.out.println(myOutput[1][2]);//ill get back to this
  
  
  
   }
}

  