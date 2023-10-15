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

    //Print elements in a range 
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        
        if(root.data>=k1&&root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        // initially root pointing to null
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // Inorder ek binary search tree ka hamesha sorted hota hai ,agar sorted mila
        // to matlab binary tree humne construct krr liya hai easily
        inorder(root);
        System.out.println();
        printInRange(root, 5, 12);
        
    }
}
