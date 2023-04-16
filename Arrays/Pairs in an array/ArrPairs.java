public class ArrPairs {

    public static void pairsArray(int arr[]) {
       int tp=0;   //tp for total number of pairs
        // Outer Loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
           System.out.println();
        }
        System.out.println("Total Pairs:"+tp);

    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairsArray(arr);
    }
}