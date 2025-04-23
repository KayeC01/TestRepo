public class MatrixModifier {

    public static void modifyMatrix(int[][] matrix, int row, int column) {
        // Check for invalid column index
        if (column < 0 || column >= matrix[row].length) {
            return;
        }

        while (column < matrix[row].length) {
            if (matrix[row][column] % 2 == 0) {
                // Even: double it
                matrix[row][column] = matrix[row][column] * 2;
            } else {
                // Odd: square it
                matrix[row][column] = matrix[row][column] * matrix[row][column];
            }
            column++;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        int row = 1;
        int column = 1;

        modifyMatrix(matrix, row, column);

        // Print the modified matrix
        for (int[] r : matrix) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
