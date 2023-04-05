public class Main {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // spaces
            int spaces = (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // First part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // second part(Right part)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
