public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert in BST
    public static Node insert(Node root, int val) {
        // root will be created if not existed
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // if condition true ,insert to the Left of root
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        // initially root pointing to null
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Inorder ek binary search tree ka hamesha sorted hota hai ,agar sorted mila
        // to matlab binary tree humne construct krr liya hai easily
        inorder(root);
        System.out.println();
    }
}