package loop.test;

/**
 * 문제3. 코드 작성: for 문을 사용하여 5층의 피라미드 모양을 별(*)로 출력하세요.
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Test03 {

  public static void main(String[] args) {
    int levels = 5;

    for (int i = 1; i <= levels; i++) {
      for (int j = 1; j <= levels - i; j++) {
        System.out.print(" ");
      }

      // 1, 3, 5, 7, 9 순서로 늘어난다.
      for (int k = 1; k <= (2 * i) - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
