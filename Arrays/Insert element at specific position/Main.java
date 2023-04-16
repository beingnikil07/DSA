class ArrayInsertion {
    public static void insert(int arr[], int n, int x, int pos) {
        // shifting elements to the right which are the right side of the position
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;
        int n = 5; // total elements present in array
        int x = 10; // which you want to insert
        int pos = 2;
        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
        // Inserting at specific position
        insert(arr, n, x, pos);
        n = n + 1;
        System.out.println("After Insertion:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }
}