//program to find sum of uper lower diagonal and diagonal elements of a matrix
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get the size of the matrix1
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Step 2: Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;
        int upperSum = 0;
        int lowerSum = 0;

        // Step 3: Calculate sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diagonalSum += matrix[i][j];   // main diagonal
                } else if (i < j) {
                    upperSum += matrix[i][j];      // upper diagonal
                } else {
                    lowerSum += matrix[i][j];      // lower diagonal
                }
            }
        }

        // Step 4: Display results
        System.out.println("\nSum of diagonal elements = " + diagonalSum);
        System.out.println("Sum of upper diagonal elements = " + upperSum);
        System.out.println("Sum of lower diagonal elements = " + lowerSum);

        sc.close();
    }
}
