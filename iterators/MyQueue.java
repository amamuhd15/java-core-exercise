import java.util.*;
public class MyQueue {
    public static void main(String[] args){
      
        Queue<String> qs = new LinkedList<String>();
        Queue<Integer> nm = new LinkedList<Integer>();

        qs.add("gamora");
        qs.add("groot");
        qs.add("loki");
        while(!qs.isEmpty())
        System.out.println(qs.poll());

        nm.add(10);
        nm.add(11);
        nm.add(12);
        nm.add(13);
        nm.add(14);
        while(!nm.isEmpty() )
        System.out.println(nm.poll() + 1);
        
    }
}
