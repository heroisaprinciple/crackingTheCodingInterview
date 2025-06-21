/*
 * Time complexity: O(2 x n x m) => O(n x m)
 * Space complexity:  O(n + m) as
 * O(n) is for using the row array and O(m) is for using the col array.
 */

package Chapter1_ArraysAndStrings.Java.Q1_8_Zero_Matrix;

public class RowAndColNullificationOptimized {
  public static void markRowsAndColumns(int[][] matrix, int rowCount, int colCount) {
    int[] rows = new int[rowCount];
    int[] cols = new int[colCount];

    for (int row = 0; row < rowCount; row++) { // O(n x m)
      for (int col = 0; col < colCount; col++) {
        if (matrix[row][col] == 0) {
          rows[row] = -1;
          cols[col] = -1;
        }
      }
    }

    setToZero(matrix, rows, cols);
  }

  private static void setToZero(int[][] matrix, int[] rows, int[] cols) {
    int rowCount = rows.length;
    int colCount = cols.length;

    for (int row = 0; row < rowCount; row++) { // O(n x m)
      for (int col = 0; col < colCount; col++) {
        if (rows[row] == -1 || cols[col] == -1) {
          matrix[row][col] = 0;
        }
      }
    }
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.printf("%4d", val);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int m = 4;
    int n = 5;
    int[][] matrix = MatrixGenerationSetZero.genRandomMatrix(n, m);
    printMatrix(matrix);

    markRowsAndColumns(matrix, n, m);

    System.out.println("Nullify:");
    printMatrix(matrix);
  }
}
