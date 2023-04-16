public class Main{
    public static void TripletsSum(int arr[],int target){
        int N=arr.length;
        int ans=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                for(int k=j+1;k<N;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+")");
                        ans++;
                    }
                    
                }
            }
        }
            System.out.println();
        System.out.println("Number of triplets whose sum is equal to target value is:"+ans);
    }
    public static void main (String[] args) {
        int arr[]={1,4,5,6,3};
        int target=12;
        TripletsSum(arr,target);
    }
}