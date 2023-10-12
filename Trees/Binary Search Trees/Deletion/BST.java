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

    // Deletion
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            //case 1:Leaf node
            if(root.left==null&&root.right==null){
                return null;
            }
            //case 2- single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3- both children
            Node IS=findInOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

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
        root = delete(root,5);
        System.out.println(); // for new line
        inorder(root);
    }
}