package Array1;
public class MinMax2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 12, 7},
            {9, 20, 3},
            {8, 15, 6}
        };

        int max = matrix[0][0];
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}