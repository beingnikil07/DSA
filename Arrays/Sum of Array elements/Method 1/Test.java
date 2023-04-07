import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int A[] = new int[10]; // array declaration
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        // Taking input from user
        for (i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        // for sum
        for (i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        System.out.println("Sum of array elements is:" + sum);
        sc.close();
    }
}