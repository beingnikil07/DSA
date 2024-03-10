/*

 *   *    *    *    
 *   *    *     
 *   *
 * 


 */




public class InvertedHalfPyramid {
    public static void main(String[] args) {
        byte rows=4,cols=4;
        byte i,j;
        for(i=1;i<=rows;i++){
            for(j=cols;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
