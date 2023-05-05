import java.util.ArrayList;

public class SwapTwo {
    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(3);
        int num1 = 2;
        int num2 = 3;
        System.out.print(list);
        swap(list, num1, num2);
        System.out.println(list);
    }
}
