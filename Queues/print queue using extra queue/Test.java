import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(5);   
        q.add(10);   
        q.add(20);   
        q.add(30);   
        q.add(40);
        System.out.println(q);  
        Queue<Integer> q2=new ArrayDeque<>();
       //inserting all in new queue
        while(q.size()>0)
        {
            int x=q.poll();
            q2.add(x);
        } 
        //again inserting all in old queue
        while(q2.size()>0){
            q.add(q2.poll());
        }
        System.out.println(q);
    }    
}
