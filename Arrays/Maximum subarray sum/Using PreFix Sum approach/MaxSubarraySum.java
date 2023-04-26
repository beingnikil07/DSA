public class MaxSubarraySum {
    public static void maxSubarraySum(int Arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int PrefixArr[] = new int[Arr.length];
        // initializing first array element
        PrefixArr[0] = Arr[0];  
        // calculate prefix array
        for (int i = 1; i < PrefixArr.length; i++) {
            PrefixArr[i] = PrefixArr[i - 1] + Arr[i];
        }

        // starting point of subarray
        for (int i = 0; i < Arr.length; i++) {
            // ending point of subarray
            for (int j = i; j < Arr.length; j++) {
                currentSum = i == 0 ? PrefixArr[j] : PrefixArr[j] - PrefixArr[i - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Subarray sum is=" + maxSum);
    }

    public static void main(String[] args) {
        int Arr[] = { -5, 8, 9, -6, 10, -15, 3 };
        maxSubarraySum(Arr);
    }
}