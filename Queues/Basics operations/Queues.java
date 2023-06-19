import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues{
    public static void main(String[] args) {
        // Queue<Integer> q=new Queue<>();
        //way1:creating Queue using ArrayDeque
        // Queue<Integer> q=new ArrayDeque<>();
        //way2:using linked list 
        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        System.out.println(q);
        q.remove();   //or you can use poll method to remove
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.size());
        
    }
}