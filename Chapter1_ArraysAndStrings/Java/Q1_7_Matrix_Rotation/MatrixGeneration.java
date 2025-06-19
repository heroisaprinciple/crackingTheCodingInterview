package Chapter1_ArraysAndStrings.Java.Q1_7_Matrix_Rotation;

import java.util.Random;

public class MatrixGeneration {
  public static int[][] genRandomMatrix(int n) {
    int[][] matrix = new int[n][n];
    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = rand.nextInt(256); // generate random 0-255 values
      }
    }
    return matrix;
  }
}
