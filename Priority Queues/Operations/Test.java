import java.util.PriorityQueue;
public class Test{
    public static void main(String[] args) {
        // creation
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // add elements
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7); 

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)

        }

    }
}