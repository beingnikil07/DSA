/*
 *          1
 *          1  2
 *          1  2  3
 *          1  2  3  4  
 */




public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        byte n=4;
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
