public class MaxSubarraySum {
    public static void maxSubarraySum(int Arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; // assigning minus infinity as value
        int n = Arr.length;

        // pick starting point i
        for (int i = 0; i < n; i++) {
            // pick ending point j
            for (int j = i; j < n; j++) {
                currentSum = 0;
                // Print
                for (int k = i; k <= j; k++) {
                    // Subarray Sum
                    currentSum = currentSum + Arr[k];
                }
                System.out.println(currentSum); // printing current sum
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Sum of maximum subarray=" + maxSum);
    }

    public static void main(String[] args) {
        int Arr[] = { -5, 8, 9, -6, 10, -15, 3 };
        maxSubarraySum(Arr);
    }
}