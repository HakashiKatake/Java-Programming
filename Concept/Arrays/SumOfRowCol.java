public class SumOfRowCol {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int sumRow = 0;
        int sumCol = 0;
        
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + sumRow);
        }
        
        for (int i = 0; i < cols; i++) {
            sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol += matrix[j][i];
            }
            System.out.println("Sum of col " + i + ": " + sumCol);
        }
    }
}