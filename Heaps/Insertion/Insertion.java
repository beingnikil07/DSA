import java.util.ArrayList;

public class Insertion {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int parent = (x - 1) / 2; // getting parent index using child index

            while (arr.get(x) < arr.get(parent)) {      //Takes O(logn) time
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
            }
        }
    }
    //peek method
    public int peek(){
        return arr.get(0);
    }
    public static void main(String[] args) {
        
    }
}