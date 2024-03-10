/**
 //Hollow Rectangle 
 *  *   *   *   *
 *              *
 *              *
 *  *   *   *   *
 
 */
public class HollowRectangle {
    public static void main(String[] args) {
            byte rows=4;
            byte cols=5;
            for(byte i=1; i<=rows;i++){
                for(byte j=1;j<=cols;j++){
                    if(i==1||j==1||i==rows||j==cols){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
