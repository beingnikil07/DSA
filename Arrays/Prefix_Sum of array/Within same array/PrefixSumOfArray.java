public class PrefixSumOfArray {
    static  int[] makePrefixSumArray(int []arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        int []sum=makePrefixSumArray(arr);
        //for print array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}