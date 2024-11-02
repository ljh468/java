package loop.test;

/**
 * 문제1. `while` 문을 사용하여 1부터 10까지의 숫자를 출력하는 코드를 작성하세요.
 */
public class Test01 {

  public static void main(String[] args) {
    int count = 1;
    while(count <= 10) {
      System.out.println(count);
      count++;
    }
  }
}
