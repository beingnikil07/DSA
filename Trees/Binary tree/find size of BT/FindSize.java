public class FindSize {
    public static int size=0;
    public static class Node {
        int val; // initially it points to zero
        Node left; // initially points to null
        Node right; // initially points to null
        // constructor

        public Node(int val) {
            this.val = val;
        }
    }
    //Traversal preorder
    public static void preorder(Node root){
            if(root==null) return;
            //System.out.println(root.val+" ");
            size++;
            preorder(root.left);
            preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        preorder(root);
        System.out.println(size);
    }
}
