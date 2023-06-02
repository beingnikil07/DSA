public class Traverse {
    public static class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            next = null; // optional ,bcz by default all are null
        }
    }

    static void traverse(Node head) {
        Node temp = head; // Now temp points to the head node
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        // let's connect them
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 'a' is the head of node ,first node of a linked list is called as head node
        // of LL.
        traverse(a);
    
    }    
}
