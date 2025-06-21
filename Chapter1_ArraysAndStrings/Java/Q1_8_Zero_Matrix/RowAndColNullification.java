/*
* Time complexity: O((n x m) x (n + m)) + O(n x m), where
* n = n of rows and m = n of columns in the matrix.
*
* Space complexity: O(1)
*/

package Chapter1_ArraysAndStrings.Java.Q1_8_Zero_Matrix;

public class RowAndColNullification {
  public static void markRowsAndColumns(int[][] matrix, int rowCount, int colCount) {
    for (int row = 0; row < rowCount; row++) { // O(n x m)
      for (int col = 0; col < colCount; col++) {
        if (matrix[row][col] == 0) {
          markRow(matrix[row]);
          markCol(matrix, col);
        }
      }
    }
  }

  // set to -1
  private static void markRow(int[] row) { // O(n)
    for (int i = 0; i < row.length; i++) {
      if (row[i] != 0) {
        row[i] = -1;
      }
    }
  }

  // set to -1
  private static void markCol(int[][] matrix, int col) { // O(m)
    for (int row = 0; row < matrix.length; row++) {
      if (matrix[row][col] != 0) {
        matrix[row][col] = -1;
      }
    }
  }

  private static void setToZero(int[][] matrix, int rowCount, int colCount) { // O(n x m)
    for (int row = 0; row < rowCount; row++) {
      for (int col = 0; col < colCount; col++) {
        if (matrix[row][col] == -1) {
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

    System.out.println("The row and col that contain 0 are set to -1");
    markRowsAndColumns(matrix, n, m);
    printMatrix(matrix);

    System.out.println("Nullify:");
    setToZero(matrix, n, m);
    printMatrix(matrix);
  }

}
