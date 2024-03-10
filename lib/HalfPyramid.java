/*
 
 * 
 *  *
 *  *   *
 *  *   *   *
 *  *   *   *   *
 
 */




public class HalfPyramid {
    public static void main(String[] args) {
        byte i,j;
        byte rows=5,cols=5;        
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
