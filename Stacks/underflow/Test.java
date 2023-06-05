package Stacks.underflow;
import java.util.Stack;

public class Test{
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        //insert
        stk.push(10);
        stk.push(10);
        stk.push(10);
        stk.push(10);
        System.out.println(stk);
        //deletion
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
    }
}