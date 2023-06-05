import java.util.Stack;

public class ReversePrint {
    public static void reverseDisplay(Stack<Integer> st) {
        // base case
        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.print(top + " ");
        reverseDisplay(st);
        st.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        reverseDisplay(stk);

    }
}