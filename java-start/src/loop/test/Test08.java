package loop.test;

/**
 * 문제8. while 문과 break 문을 사용하여 다음과 같은 별 피라미드를 역방향으로 출력하세요. (예: 5층의 피라미드)
 *
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Test08 {

  public static void main(String[] args) {
    int levels = 5;
    int row = levels;

    // 각 층을 반복
    while (true) {
      // 왼쪽 공백을 층 수에 맞게 출력
      for (int j = 0; j < levels - row; j++) {
        System.out.print(" ");
      }
      // 별(*)을 출력하여 역 피라미드 형태 완성
      for (int k = 0; k < (2 * row) - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
      row--; // 다음 줄을 위해 층을 하나 줄임

      // `row`가 0이면 종료
      if (row == 0) break;
    }
  }
}
