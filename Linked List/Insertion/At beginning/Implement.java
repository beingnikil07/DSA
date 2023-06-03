public class Implement {
    public static class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Linkedlist {
        // initializing head and tail
        Node head = null;
        Node tail = null;

        // creating function to insert a node at the end of linked list
        void insertAtEnd(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBeginning(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
            }
            head = temp;

        }

        // to display
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        Linkedlist li = new Linkedlist();
        li.insertAtBeginning(2);
        li.insertAtBeginning(1);
        li.insertAtBeginning(0);
        li.display();

    }
}