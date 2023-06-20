public class Queues {
    public static class Queue{

        int front = -1;
        int rear = -1;
        int MAX = 5;
        int arr[] = new int[MAX];

        // Enqueue operation
        public void add(int value) {
            if (rear == MAX - 1) {
                System.out.println("Queue is full");
            }
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
               rear=rear+1;
            }
            arr[rear]=value;
        }

        // Dequeue operation
        public void remove() {
            int item;
            if (front == -1 || front > rear) {
                System.out.println("Queue is Empty");
            } else {
                item = arr[front];
                if (front>=rear) {
                    front =-1;
                    rear = -1;
                } else {
                   front=front+1;
                }
            }
        }

        // display
        public void display() {
            if (rear == -1) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        //peek 
        public int peek(){
            if(front==-1||front>rear){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return arr[front];
            }
        }
    }
    public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.display();
    q.remove();
    q.remove();
    q.display();
    // System.out.println(q.peek());
}
}