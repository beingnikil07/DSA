public class Main{
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            //starts
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=rows-1;i>=1;i--)
        {
            //starts
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}