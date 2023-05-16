import java.util.*;
public class N{
    
static void printNaturalIncreasing(int n){
    if(n==1)
    {
        System.out.print(n);
        return ;
    }
    printNaturalIncreasing(n-1);
    System.out.print(n);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
        int n=sc.nextInt();
        printNaturalIncreasing(n);
        
    }
}