
// The Floyd's triangle is a right angled triangle that contains consecutive natural numbers.
// In Floyd's triangle, the number start with 1 in the top left 


/*   Floyd Triangle
 *  1
 *  2  3
 *  4  5  6
 *  7  8  9  10
 *  11 12 13 14  15 
 * 
 */
public class FloydTriangle {
    public static void main(String[] args) {
        byte rows=5;
        byte num=1;
        for(byte i=1;i<=rows;i++){
            for(byte j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }        
    }
}
