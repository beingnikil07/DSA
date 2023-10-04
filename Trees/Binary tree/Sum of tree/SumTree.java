public class SumTree {
    public static class Node {
        int val; // initially it points to zero
        Node left; // initially points to null
        Node right; // initially points to null
        // constructor

        public Node(int val) {
            this.val = val;
        }
    }

    // size
    public static int sum(Node root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) +sum(root.right);
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
        System.out.println(sum(root));
    }
}
