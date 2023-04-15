public class LeftRotate {
    public static void rotate(int arr[], int d, int n) {
        // k is a variable used to keep track of the number of rotations performed so
        // far
        int k = 1;
        while (k <= d) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int N = arr.length;
        int d = 2; // kis position tkk rotate karana hai
        System.out.println("Array after left rotation:");
        rotate(arr, d, N);
    }
}