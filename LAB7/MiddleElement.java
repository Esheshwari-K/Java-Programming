//find mid element of square matrix

public class MiddleElement {
    public static void main(String[] args) {
        // Example: 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length; // number of rows (and columns, since it's square)

        if (n % 2 == 1) {
            int mid = n / 2;
            System.out.println("Middle element: " + matrix[mid][mid]);
        } else {
            System.out.println("Matrix has even dimensions, no single middle element.");
        }
    }
}
