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

    // validate BST
    public static boolean isValidBST(Node root, Node min, Node max) {
        // If root null hoga ,mean koi node he nii hogi to wo bhi ek valid BST hoga
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        // checking for left subtree
        return isValidBST(root.left, min, root)
                && isValidBST(root.right,root, max);
    }

    public static void main(String[] args) {
        int values[] = { 8,5,3,6,1,4,10,11,14 };
        // initially root pointing to null
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Inorder ek binary search tree ka hamesha sorted hota hai ,agar sorted mila
        // to matlab binary tree humne construct krr liya hai easily
        inorder(root);
        System.out.println();

        if (isValidBST(root, null, null)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not Valid BST");
        }
    }
}