public class runtimeOne extends runtime {
    
    public void greeting(){
        System.out.println("Most Hated One");
        
    }
public static void main(String[] args) {
        runtime ran = new runtime();
      runtime ren = new runtimeOne();
       ran.greeting();
       ren.greeting();
}
}
