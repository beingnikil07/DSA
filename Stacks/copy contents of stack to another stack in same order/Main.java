import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        stk1.push(1);
        stk1.push(2);
        stk1.push(3);
        stk1.push(4);
        System.out.println(stk1);
        Stack<Integer> stk2 = new Stack<>();
        // way1
        // while(stk1.size()>0)
        // {
        // int x=stk1.pop();
        // stk2.push(x);
        // }

        // way2
        while (stk1.size() > 0) {
            stk2.push(stk1.pop());
        }
        System.out.println(stk2);
        Stack<Integer> stk3 = new Stack<>();
        // way 1
        // while(stk2.size()>0)
        // {
        // int x=stk2.pop();
        // stk3.push(x);
        // }

        // way2

        while (stk2.size() > 0) {
            stk3.push(stk2.pop());
        }
        System.out.println(stk3);
    }
} 