import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        // Creation of arrayList
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // //Access elements
        // int element=list.get(0);
        // System.out.println(element);
        // //second way
        // System.out.println(list.get(3));

        // Remove operation
        // int element = list.remove(4);
        // System.out.println(list);
        // // set(change) element at index
        // list.set(0,5);
        // System.out.println(list);
  
  
        //search operation
        System.out.println(list.contains(5));
        System.out.println(list.contains(0));
    }


}