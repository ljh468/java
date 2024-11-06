package array.test;

/**
 * 문제1. 2차원 `int` 배열을 생성하고, 각 행과 열의 합을 계산하여 배열의 모든 요소와 각 행과 열의 합을 출력하는 코드를 작성하세요.<p>
 * <p>
 * {1, 2, 3},<p>
 * {4, 5, 6},<p>
 * {7, 8, 9}<p>
 */
public class Test01 {

  public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int[] rowSum = new int[matrix.length];
    int[] colSum = new int[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        rowSum[i] += matrix[i][j];
        colSum[i] += matrix[j][i];
      }
    }

    // 결과 출력
    for (int i = 0; i < rowSum.length; i++) {
      System.out.println(i + "행의 합: " + rowSum[i]);
    }
    System.out.println();
    for (int j = 0; j < colSum.length; j++) {
      System.out.println(j + "열의 합: " + colSum[j]);
    }
  }
}
