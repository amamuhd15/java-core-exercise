public class runtimeTwo extends runtime {
    
    public void greeting(){
        System.out.println("a Happy Belated One");
        
    }

    public static void main(String[] args){
       runtime run = new runtimeTwo();
       run.greeting();

    }

    
}
