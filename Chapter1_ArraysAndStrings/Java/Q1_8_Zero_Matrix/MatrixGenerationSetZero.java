package Chapter1_ArraysAndStrings.Java.Q1_8_Zero_Matrix;

import java.util.Random;

public class MatrixGenerationSetZero {
  public static int[][] genRandomMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = rand.nextInt(256); // generate random 0-255 values
      }
    }

    matrix[0][1] = 0; // always 0 at [0][1]
    matrix[1][0] = 0; // always 0 at [0][1]
    return matrix;
  }
}
