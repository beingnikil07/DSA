public class ImplementLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        private Node top;

        public Stack() {
            this.top = null;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
            System.out.println(data + " pushed to the stack.");
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            } else {
                int data = top.data;
                top = top.next;
                return data;
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            } else {
                return top.data;
            }
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
            } else {
                Node current = top;
                System.out.print("Stack: ");
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Peek: " + stack.peek());

        stack.pop();
        stack.display();
    }

}