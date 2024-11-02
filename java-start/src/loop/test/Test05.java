package loop.test;

/**
 * 문제5. 다음과 같은 형태의 별 피라미드를 for 문과 break 문을 사용하여 작성하세요.<p>
 * 5번째 줄에서 중단되도록 합니다.
 *
 *     *
 *    ***
 *   *****
 *  *******
 */
public class Test05 {

  public static void main(String[] args) {
    int levels = 5;

    for (int i = 1; i <= levels; i++) {
      for (int j = 1; j <= levels - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i) - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
      if (i == 5) break;
    }
  }
}
