import java.util.ArrayList;

public class Traverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // know the size of arrayList
        System.out.println(list.size());
        // print all arraylist
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
