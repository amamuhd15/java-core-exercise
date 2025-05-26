public class exception {
    public static void main(String[] args)throws Exception{
        int one, two, three;
        one = 10;
        two = 0;
        three = one/two;
        try{
            three = one/two;
            System.out.println(three);
        }
        catch(Exception e){
            
            System.out.println("try again" );
        }finally{
            System.out.println("try again okay");
        }
        
    }
}
