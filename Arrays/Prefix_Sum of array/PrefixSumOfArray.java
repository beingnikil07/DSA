public class PrefixSumOfArray {
    static  int[] makePrefixSumArray(int []arr)
    {
        int n=arr.length;
        int []pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        int []pref=makePrefixSumArray(arr);
        //for print array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(pref[i]+" ");
        }
    }
}