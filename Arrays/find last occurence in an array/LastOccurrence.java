public class LastOccurrence {
    static int findLastOccurrence(int arr[], int x) {
       int lastIndex=-1;
      for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               lastIndex=i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 5, 3, 5, 4 };
        int x = 5;
        int lastOccurrence = findLastOccurrence(arr, x);
        System.out.print("Last occurrence of x is=" + lastOccurrence);
    }
}
