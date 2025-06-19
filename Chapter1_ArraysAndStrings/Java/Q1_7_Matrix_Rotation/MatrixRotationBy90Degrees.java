/*
 * Time complexity: O(n^2) -> nested loops
 * Space compexity: O(n^2)
 */

package Chapter1_ArraysAndStrings.Java.Q1_7_Matrix_Rotation;

// no need to import MatrixGeneration, both classes are in the same package

public class MatrixRotationBy90Degrees {
  public static int[][] rotateMatrix(int[][] matrix, int n) {
    int[][] rotatedMatrix = new int[n][n];
    for (int i = 0; i < n; i++) { // O(n)
      for (int j = 0; j < n; j++) { // O(n)
        rotatedMatrix[j][n - 1 - i] = matrix[i][j];
      }
    }
    return rotatedMatrix;
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
    int n = 4;
    int[][] matrix = MatrixGeneration.genRandomMatrix(n);
    System.out.println("The original matrix!");
    printMatrix(matrix);

    int[][] rotatedMatrix = rotateMatrix(matrix, n);
    System.out.println("The rotated one!");
    printMatrix(rotatedMatrix);
  }

}
