public class Fibonacci {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = fib(n);
        
        System.out.println("Fibonacci series till  " + n + " is=" + res);
    }
}