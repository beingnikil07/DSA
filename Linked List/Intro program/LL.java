public class LL{
    //Creating a node of linked list
    public static class Node{
        int data;
        Node next;  //holds address of next node
        Node(int data)
        {
            this.data=data;
        }

    }
    public static void main(String[] args) {
        //initializing nodes a,b,c,d,e
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);
        //till now they are not connected with each other,let's connect all
        //initially the next for all nodes is null by default
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        //Display each node adress
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);
        System.out.println(a.next.data);


    }
}