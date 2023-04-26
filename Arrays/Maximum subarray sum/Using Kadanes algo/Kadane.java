public class Kadane {
    public static void maximumSubarraySum(int Arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < Arr.length; i++) {
            currSum = currSum + Arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            //// Comparing maxSum & CurrSum ,we get which one is maximum
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum subarray sum is=" + maxSum);
    }

    public static void main(String[] args) {
        int Arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maximumSubarraySum(Arr);
    }
}