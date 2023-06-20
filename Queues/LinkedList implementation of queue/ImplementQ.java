public class ImplementQ {
   public static class Node {
      int data;
      Node next;

      Node(int data) {
         this.data = data;
      }
   }

   public static class Queue{
      Node head = null;
      Node tail = null;
      int size = 0;

      // Enqueue operation
      public void add(int value) {
         Node temp = new Node(value);
         if (size == 0) {
            head = temp;
            tail = temp;
         } else {
            tail.next = temp;
            tail = temp;
         }
         size++;
      }

      // deque operation
      public int remove() {
         if (size == 0) {
            System.out.println("Queue is Empty");
         }
         int item = head.data;
         head = head.next;
         size--;
         return item;

      }

      // display
      public void display() {
         Node temp = head;
         while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
         }
         System.out.println();
      }
      //peek
      public int peek(){
         if(size==0){
            System.out.println("Queue is Empty");
            return -1;
         }
         return head.data;
      }
      //isEmpty
      public boolean isEmpty(){
         if(size==0) return true;
         return false;
      }

   }
   public static void main(String[] args) {
      Queue q=new Queue();
      q.add(5);
      q.add(10);
      q.add(15);
      q.add(20);
      q.display();
      q.remove();
      q.remove();
      q.display();
      System.out.println(q.peek());
      System.out.println(q.isEmpty());
   }
}
