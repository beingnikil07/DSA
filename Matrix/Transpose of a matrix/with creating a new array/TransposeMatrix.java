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
    static int[][] findTranspose(int[][] matrix, int row, int col) {
        int[][] ans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and cols of a matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        int totalElements=row*col;
        System.out.print("Enter "+totalElements+" Values:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix is:");
        printMatrix(matrix);
        System.out.println("Transpose of a matrix is:");
        int [][]ans=findTranspose(matrix, row, col);
        printMatrix(ans);
    }
}