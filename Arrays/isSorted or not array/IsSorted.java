public class IsSorted {
    static boolean isSorted(int arr[]) {
        boolean check = true; // initialize true becz empty array is also a sorted array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                // Not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 6, 6, 8, 9 };
        boolean bool = isSorted(arr);
        System.out.print("Is Sorted=" + bool);
    }
}