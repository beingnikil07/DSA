public class Main {
    public static void main(String[] args) {
        int rows = 4;
        // Upper Half
        for (int i = 1; i <= rows; i++) {
            // First Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         //Lower Half
         for (int i=rows;i>=1;i--) {
            // First Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}