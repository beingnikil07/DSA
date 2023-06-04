import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        // checks whether stack is empty or not
        System.out.println(stk.isEmpty());
        stk.push(5);
        stk.push(10);
        stk.push(15);
        stk.push(20);
        // printing stack
        System.out.println(stk);
        // to get the top of the stack
        System.out.println(stk.peek());
        // pop operation
        stk.pop();
        System.out.println(stk);
    }
}