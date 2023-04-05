public class Main {
    public static void main(String[] args) {
        char ch = 'A';
        // Outer Loop
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}