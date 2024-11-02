package loop.ex;

/**
 * 문제: 구구단 출력<p>
 * 중첩 for문을 사용해서 구구단을 완성해라.ø
 */
public class NestedEx1 {

  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " * " + j + " = " + i * j);
      }
    }
  }
}
