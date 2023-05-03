public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // In primary diagonal sum the value of row and column are equal
            sum = sum + matrix[i][i];
            // To find secondary diagonal sum:
            // i+j=n-1 mean we can find j value
            // j=n-1-i
            if (i != matrix.length - 1 - i) {
                sum = sum + matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } }; // 4*4 matrix
        int res = diagonalSum(matrix);
        System.out.println("Diagonal sum=" + res);
    }
}