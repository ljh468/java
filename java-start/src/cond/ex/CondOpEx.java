package cond.ex;

/**
 * 문제: 더 큰 숫자 찾기<p>
 * 여러분은 두 개의 정수 변수 `a` 와 `b` 를가지고있다.<p>
 * `a` 의값은 `10` 이고, `b` 의값은 `20` 이다.<p>
 * 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
 */
public class CondOpEx {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    int max = (a > b) ? a : b;
    System.out.println("더 큰 숫자는 " + max + "입니다.");
  }
}
