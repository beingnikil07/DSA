public class SecondLargest {
    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }    
    public static void main(String[] args) {
        int arr[]={9,8,9,6,9,5,8};
        int max=findMax(arr);  //storing first largest element in array 
        //Mark first largest element as Minus infinity
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=Integer.MIN_VALUE;   //marks first largest element as minus infinity
            }
        }        
        //Finding second largest element by traverse array again
        int secondLargest=findMax(arr);
        System.out.println("Second largest element of array is="+secondLargest);
    }

}
