package loop.test;

/**
 * 문제4. do-while 문과 continue 키워드를 사용하여 1부터 20까지 숫자 중 홀수만 출력하는 코드를 작성하세요.
 */
public class Test04 {

  public static void main(String[] args) {
    int count = 1;
    do {
      System.out.println(count);
      count += 2;
    } while (count <= 20);
  }
}
