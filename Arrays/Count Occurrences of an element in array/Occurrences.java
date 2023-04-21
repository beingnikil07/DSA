public class Occurrences {
    static int countOccurrences(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 5, 1, 5 };
        int x = 5;
        int res = countOccurrences(arr, x);
        System.out.print("cont of X is =" + res);
    }
}