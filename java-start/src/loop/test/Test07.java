package loop.test;

/**
 * 문제7. for 문과 continue 키워드를 사용하여, 1부터 100까지 숫자 중 3과 5의 공배수인 숫자만 출력하는 코드를 작성하세요.
 */
public class Test07 {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 3 != 0 || i % 5 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
