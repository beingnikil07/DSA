public class Main {
    public static void main(String[] args) {
        int n = 4;
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Second half 
        for(int i=n;i>=1;i--) {
            // Spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}