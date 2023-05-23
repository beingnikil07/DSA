public class BubbleSort {
    // Method :Bubble sort
    static void bubble_Sort(int arr[], int N) {
        int i, j, temp;
        for (i = 0; i < N - 1; i++) {
            for (j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j],arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 3, 8, 9, };
        int N = arr.length;
        print(arr);
        bubble_Sort(arr, N);
        print(arr);
    }
}