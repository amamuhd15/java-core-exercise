import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){

        ArrayList<String> al = new ArrayList<String>();

        ArrayList<Integer> li = new ArrayList<Integer>();

        //integer 
        li.add(66);
        li.add(77);
        li.add(88);
        //String
        al.add("aston martin");
        al.add("bentley");
        al.add("chevrolet");
        al.add("dodge");
        al.add("elva");
        al.add("ferrari");

        for(String stringOutput : al){
        System.out.println(stringOutput);
        }
        for(Integer intOutput : li)
        System.out.println(intOutput);
    }
}
