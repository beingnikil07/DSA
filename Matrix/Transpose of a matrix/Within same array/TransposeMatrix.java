import java.util.Scanner;

public class TransposeMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose of matrix
    static void transposeInPlace(int[][] matrix, int row, int col) {
        int temp;
        for (int i = 0; i < col; i++) {
            for (int j =i; j < row; j++) {
                // Swap ,matrix[i][j],matrix[j][i]
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols of a matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int totalElements = row * col;
        System.out.print("Enter " + totalElements + " Values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix is:");
        printMatrix(matrix);
        System.out.println("Transpose of a matrix is:");
        transposeInPlace(matrix, row, col);
        printMatrix(matrix);
    }
}