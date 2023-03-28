public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) { 
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
