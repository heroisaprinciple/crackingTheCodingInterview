/*
 * Time compexity: O(2 * N^2) => O(N^2)
 * Space complexity: O(1) as rotation happens in-place
 *
 * Transpose + reverse.
 */

package Chapter1_ArraysAndStrings.Java.Q1_7_Matrix_Rotation;

public class MatrixRotationBy90DegreesOptimalSpace {
  public static void rotateMatrix(int[][] matrix, int n) {
    transposeMatrix(matrix, n);
    reverse(matrix, n);
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.printf("%4d", val);
      }
      System.out.println();
    }
  }

  // transpose in-place above the main diagonal (the main diagonal is not touched)
  private static void transposeMatrix(int[][] matrix, int n) {
    for (int i = 0; i < n - 1; i++) { // O(n)
      for (int j = i + 1; j < n; j++) { // O(n)
        swap(matrix, i, j); // swap elements
      }
    }
  }

  // takes O(1) for all operations
  private static void swap(int[][] matrix, int i, int j) {
    int temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;
  }

  private static void reverse(int[][] matrix, int n) {
    for (int i = 0; i < n; i++) { // O(n)
      int left = 0;
      int right = n - 1;
      while (left < right) { // O(n) per row
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
    }
  }

  public static void main(String[] args) {
    int n = 4;
    int[][] matrix = MatrixGeneration.genRandomMatrix(n);
    System.out.println("The original matrix!");
    printMatrix(matrix);

    transposeMatrix(matrix, n);
    System.out.println("The transposed one!");
    printMatrix(matrix);

    reverse(matrix, n);
    System.out.println("The reversed one!");
    printMatrix(matrix);
  }
}
