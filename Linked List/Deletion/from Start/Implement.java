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

        // delete from beginning
        void deleteFromStart() {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            } else {
                // checks whether the link contains only one node
                // If not, the head will point to next node in the list and tail will point to
                // the new head.
                if (head != tail) {
                    head = head.next;
                }
                // If the list contains only one node
                // then, it will remove it and both head and tail will point to null
                else {
                    head = tail = null;
                }
            }
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
        li.insertAtEnd(5);
        li.insertAtEnd(10);
        li.insertAtEnd(15);
        li.display();
        li.deleteFromStart();
        System.out.println();
        li.display();

    }
}