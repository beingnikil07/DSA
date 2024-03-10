/*
 *          1  2  3  4  5
 *          1  2  3  4
 *          1  2  3  
 *          1  2
 *          1
 *
 * 
 * 
 * 
 * 
 * 
 */
public class HalfPyramidWithIncreasingNumbers {
    public static void main(String[] args) {
        byte n=5;
        for(byte i=5;i<=n&&i>0;i--){
            for(byte j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
