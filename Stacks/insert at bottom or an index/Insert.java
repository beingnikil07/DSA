import java.util.Stack;

public class Insert {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        stk1.push(1);
        stk1.push(2);
        stk1.push(3);
        stk1.push(4);
        System.out.println(stk1);
        // insert at bottom of the stack
        Stack<Integer> stk2 = new Stack<>();
        while (stk1.size() > 0) {
            stk2.push(stk1.pop());
        }
        stk1.push(5);
        while (stk2.size() > 0) {
            stk1.push(stk2.pop());
        }
        System.out.println(stk1);

        // insert at an index
        int index = 2;
        int num = 10;
        while (stk1.size() > 2) {
            stk2.push(stk1.pop());
        }
        stk1.push(num);
        while (stk2.size() > 0) {
            stk1.push(stk2.pop());
        }
        System.out.println(stk1);

    }
}
