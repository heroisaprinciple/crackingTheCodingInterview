/*
 * We can reduce the space to 0(1) by using the first row as a replacement for
 * the row array and the first column as a replacement for the column array.
 *
 * The first row and column are used as markers and extra boolean vars
 * to track whether the original first row or first column had any zero,
 * since their positions are reused for marking.
 *
 * Algorithm:
 * 1. Check if first row/column originally contain zeros and set boolean vars
 * 2. Use first row/column to mark which rows/columns need zeroing
 * 3. Apply zeros to internal matrix based on markers
 * 4. Nullify first row/column if they originally contained zeros
 *
 * Time complexity: O(m x n)
 * Space complexity: O(1)
 */

package Chapter1_ArraysAndStrings.Java.Q1_8_Zero_Matrix;

public class RowAndColNullificationSpaceOptimal {
  public static void markRowsAndColumns(int[][] matrix, int rowCount, int colCount) {
    boolean rowHasZero = hasZeroInFirstRow(matrix, colCount);
    boolean colHasZero = hasZeroInFirstCol(matrix, rowCount);

    markZeroesInMatrix(matrix, rowCount, colCount);
    modifyFromMarkers(matrix, rowCount, colCount);

    // now check if either row 0 or col 0 need 0
    if (rowHasZero) {
      zeroFirstRow(matrix, colCount);
    }

    if (colHasZero) {
      zeroFirstCol(matrix, rowCount);
    }
  }

  // check if row 0 has any 0
  private static boolean hasZeroInFirstRow(int[][] matrix, int colCount) {
    for (int j = 0; j < colCount; j++) {
      if (matrix[0][j] == 0)
        return true;
    }
    return false;
  }

  // check is col 0 has any 0
  private static boolean hasZeroInFirstCol(int[][] matrix, int rowCount) {
    for (int i = 0; i < rowCount; i++) {
      if (matrix[i][0] == 0)
        return true;
    }
    return false;
  }

  // mark rows and cols that should be zeroed using row 0 and col 0
  private static void markZeroesInMatrix(int[][] matrix, int rowCount, int colCount) {
    for (int i = 1; i < rowCount; i++) {
      for (int j = 1; j < colCount; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0; // mark row
          matrix[0][j] = 0; // mark col
        }
      }
    }
  }

  // modify the internal matrix (not all matrix) based on that marking
  private static void modifyFromMarkers(int[][] matrix, int rowCount, int colCount) {
    for (int i = 1; i < rowCount; i++) {
      for (int j = 1; j < colCount; j++) {
        if (matrix[i][j] != 0)
          if (matrix[i][0] == 0 || matrix[0][j] == 0)
            matrix[i][j] = 0;
      }
    }
  }

  private static void zeroFirstRow(int[][] matrix, int colCount) {
    for (int j = 0; j < colCount; j++) {
      matrix[0][j] = 0;
    }
  }

  private static void zeroFirstCol(int[][] matrix, int rowCount) {
    for (int i = 0; i < rowCount; i++) {
      matrix[i][0] = 0;
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
