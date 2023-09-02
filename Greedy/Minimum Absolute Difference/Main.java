import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };
        // sorting
        Arrays.sort(A);
        Arrays.sort(B);
        int minAbsDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minAbsDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum Absolute difference of pairs:" + minAbsDiff);
    }
}
