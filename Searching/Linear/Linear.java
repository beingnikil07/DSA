public class Linear {
    public static int Linear(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
}
    public static void main(String[] args) {
        int arr[] = {15, 20, 30, 1, 15, 5 };
        int target =5;
        int res = Linear(arr, target);
        if (res == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index:" + res);
    }
}