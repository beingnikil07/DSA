public class Main {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Spaces
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            // Numbers ->print row number ,row number of times
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
