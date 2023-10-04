public class Implement {
    public static class Node {
        int val; // initially it points to zero
        Node left; // initially points to null
        Node right; // initially points to null
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.val=1;
        System.out.println(root.val);
    }
}
