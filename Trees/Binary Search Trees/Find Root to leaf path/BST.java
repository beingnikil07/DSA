import java.util.ArrayList;

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

    // Method to print the path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ->");
        }
        System.out.println("NULL");
    }

    // Root to leaf paths
    public static void rootToLeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeafPath(root.left, path);
        rootToLeafPath(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6,10, 11, 14 };
        // initially root pointing to null
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Inorder ek binary search tree ka hamesha sorted hota hai ,agar sorted mila
        // to matlab binary tree humne construct krr liya hai easily
        inorder(root);
        System.out.println();
        rootToLeafPath(root, new ArrayList<>());
    }
}