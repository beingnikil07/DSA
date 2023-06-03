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

        void insertAtIndex(int index, int value) {
            Node temp = new Node(value);
            Node t = head;
            if (index == size()) {
                insertAtEnd(value);
                return;
            } else if (index == 0) {
                insertAtBeginning(value);
                return;
            } else if (index < 0 || index > size()) {
                System.out.println("Wrong index");
                return;
            }

            for (int i = 1; i <= index - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
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

        // To know the size
        int size() {
            Node t = head;
            int count = 0;
            while (t != null) {
                count++;
                t = t.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        Linkedlist li = new Linkedlist();
        li.insertAtEnd(10);
        li.insertAtEnd(20);
        li.insertAtEnd(30);
        li.insertAtEnd(40);
        li.insertAtEnd(50);
        li.insertAtIndex(2, 25);
        li.insertAtIndex(0, 5);
        li.display();

    }
}