public class Test {
    public static void changeArr(int arr[], int index, int val) {
        // Base case
        if (index == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[index] = val;
        changeArr(arr, index + 1, val + 1); // function calling step
        arr[index] = arr[index] - 2; // Backtracking step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       int arr[]=new int[5];
       changeArr(arr,0,1);    //passing array,index,value to change arr function
       printArr(arr);
    }
}