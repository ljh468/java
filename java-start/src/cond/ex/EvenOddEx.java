package cond.ex;

/**
 * 문제: 홀수 짝수 찾기<p>
 * 정수 `x` 가 주어지면 `x` 가 짝수이면 "짝수"를, `x` 가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자. 삼항 연산자를 사용해야 한다.<p>
 * <p>
 * 참고로 `x % 2` 를사용하면홀수,짝수를쉽게계산할수있다.
 */
public class EvenOddEx {

  public static void main(String[] args) {
    int x = 3;
    String result = (x % 2 == 0) ? "짝수" : "홀수";
    System.out.println("x = " + x + ", " + result);
  }
}
