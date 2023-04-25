public class Subarray {
    static int arr[] = new int[] { 2, 4, 6, 8, 10 };

    // Prints all subarrays in arr[0 to n-1]
    static void subArray(int n) {
        // pick starting point i
        for (int i = 0; i < n; i++) {
            // pick ending point j
            for (int j = i; j < n; j++) {
                // print subarray between current starting and ending points
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("All non-empty subarrays :");
        subArray(arr.length);
    }
}