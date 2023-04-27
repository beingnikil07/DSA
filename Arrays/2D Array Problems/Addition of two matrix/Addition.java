import java.util.Scanner;

public class Addition {
    static void display(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row & Column of matrix");
        row = sc.nextInt();
        col = sc.nextInt();
        // creating two matrix..
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        System.out.print("Enter first matrix elements:");
        // Taking input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        display(A, row, col);
        System.out.println("Enter Second Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        display(A, row, col);
        int[][] sum = new int[row][col];
        // calculating sum of both matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Sum Of both matrix is:");
        display(sum, row, col);
    }
}