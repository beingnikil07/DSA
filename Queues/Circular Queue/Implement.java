public class Implement {
    public static class CircularQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        // Insertion
        public void add(int value) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");

            } else if (size == 0) {
                front = 0;
                rear = 0;
                arr[0] = value;
            } else if (rear < arr.length - 1) {
                arr[++rear] = value;
            } else if (size == arr.length - 1) {
                rear = 0;
                arr[0] = value;
            }
            size++;
        }

        // Deletion
        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty !");
            } else {
                int item = arr[front];
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return item;
            }
        }

        // peek
        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty !");
            } else {
                return arr[front];
            }
        }

        // isEmpty
        public boolean isEmpty() {
            if (size == 0)
                return true;
            return false;
        }

        // Display
        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                // rear<front
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue();
        q.display();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.display(); // 5 4 3 2 1
        q.remove();
        q.display(); // 4 3 2 1
        q.add(5);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

    }

}
