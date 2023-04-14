public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }
            // if key is greater,ignore left half
            if (arr[mid] < key) {
                start = mid + 1;
            }
            // if key is smaller ,ignore right half
            else {
                end = mid - 1;
            }
        }
        // key is not found in array
        return -1;
    }

    // main method
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,15,20,30};
        int key=30;
        System.out.print("Index for key is :"+binarySearch(arr, key));
    }
}
