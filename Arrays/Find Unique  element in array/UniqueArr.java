//W.A.P to find the unique number in a given array where all the elements are being repeated 
//twice with one value being unique ?
public class UniqueArr {
    public static int uniqueFind(int arr[], int N) {
        // Traverse array
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1; // -1 ka matlab repeat ho rha hai array mai
                    arr[j] = -1;
                }
            }
        }

        // Traverse array again
        int ans = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) // or you can also write arr!=-1
            {
                ans = arr[i]; // store unique array element to a variable
            }
        }
        return ans;
    }

    // Driver
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1, 3 };
        int N = arr.length;
        int res = uniqueFind(arr, N);
        System.out.println("Unique elemet that is not being repeated is:" + res);
    }
}
