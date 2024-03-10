/*
 *                         *
 *                      *  *
 *                   *  *  *
 *                *  *  *  *
 * 
 * 
 */


public class InvertedHaldPyramidRotate180Deg {
    public static void main(String[] args) {
        byte n=4;
        //for outer loop
            for(byte i=1;i<=n;i++){
                //for blank spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //for start
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
