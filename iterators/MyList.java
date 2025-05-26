import java.util.*;
public class MyList {
    
    public static void main(String[] args) {
        
        List<Integer> ls = new ArrayList<Integer>();

        Stack<String> ss = new Stack<String>();
    
        ls.add(11);
        ls.add(12);
        ls.add(13);
        ls.add(14);
        ls.add(15);
        for(Integer Output : ls)
        System.out.println(Output);

       
        ss.push("Pile One");
        ss.push("Pile Two");
        ss.push("Pile Three");
        ss.push("Pile Four");
        while(!ss.empty()){
            System.out.println(ss.pop());
        }
    }
}
