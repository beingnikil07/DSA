import java.util.*;

public class PrintSpiral {
    // print metrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // for new line
        }
    }

    // Print Spiral order of a matrix
    static void printSpiralOrder(int[][] matrix, int row, int col) {
        int topRow = 0, bottomRow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElements = 0;

        while (totalElements < row * col) {
            // Print topRow ->LeftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < row * col; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // Print rightCol ->topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < row * col; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // Print bottomRow ->rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < row * col; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            // Print leftCol ->bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < row * col; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

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
        System.out.println("Spiral Order of matrix is:");
        printSpiralOrder(matrix, row, col);
    }
}