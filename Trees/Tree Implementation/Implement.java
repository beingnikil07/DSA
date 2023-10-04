public class Implement {
    public static class Node {
        int val; // initially it points to zero
        Node left; // initially points to null
        Node right; // initially points to null
        // constructor

        public Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root) {
        if(root==null) return;
        System.out.print(root.val + "=>");
        if(root.left!=null){
            System.out.print(root.left.val + ", ");
        }else{
            System.out.print(null+",");
        }
        if(root.right!=null){
            System.out.println(root.right.val + " ");
        }else{
            System.out.println(null+",");
        }
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        display(root);
    }
}
