public class Selection {
    static void selection_Sort(int arr[], int n) {
        int i, j, min, temp;
        for (i = 0; i <= n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // display
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 9, 1, 3, 6 };
        int n = arr.length;
        selection_Sort(arr, n);
        display(arr);
    }
} 