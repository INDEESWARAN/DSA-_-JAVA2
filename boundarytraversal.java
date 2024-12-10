import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixTraversal {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Edge case: if the matrix is empty
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int n = matrix.length;  // Number of rows
        int m = matrix[0].length;  // Number of columns

        // Initialize the boundaries for the spiral traversal
        int cnt = 0;  // Counter for elements added
        int tne = n * m;  // Total number of elements
        int minr = 0, minc = 0;  // Starting row and column (min row and col)
        int maxr = n - 1, maxc = m - 1;  // Ending row and column (max row and col)

        // Traverse the matrix in a spiral order
        while (cnt < tne) {
            // Traverse the top row from left to right
            for (int j = minc; j <= maxc && cnt < tne; j++) {
                result.add(matrix[minr][j]);
                cnt++;
            }
            minr++;  // Move the top boundary down

            // Traverse the right column from top to bottom
            for (int i = minr; i <= maxr && cnt < tne; i++) {
                result.add(matrix[i][maxc]);
                cnt++;
            }
            maxc--;  // Move the right boundary left

            // Traverse the bottom row from right to left
            for (int j = maxc; j >= minc && cnt < tne; j--) {
                result.add(matrix[maxr][j]);
                cnt++;
            }
            maxr--;  // Move the bottom boundary up

            // Traverse the left column from bottom to top
            for (int i = maxr; i >= minr && cnt < tne; i--) {
                result.add(matrix[i][minc]);
                cnt++;
            }
            minc++;  // Move the left boundary right
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }
}
