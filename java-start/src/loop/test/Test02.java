package loop.test;

/**
 * 문제2. 코드 작성: `for` 문을 사용하여 다음과 같은 형태로 숫자를 출력하세요.
 *
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class Test02 {

  public static void main(String[] args) {
    int num = 1;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((num++) + " ");
      }
      System.out.println();
    }
  }
}
