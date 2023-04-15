import javax.naming.ldap.StartTlsRequest;

public class ReverseArray {
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // method to print array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // driver code
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        printArray(arr);
        reverseArray(arr, 0, arr.length-1);
        printArray(arr);
    }

}