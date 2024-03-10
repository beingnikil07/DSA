//Q1. Solid Rectangle
/**
 * 
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * 
 */

public class SolidRectangle {
    public static void main(String[] args) {
        byte rows = 4;
        byte cols = 5;
        for (byte i = 0; i < rows; i++) {
            for (byte j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}