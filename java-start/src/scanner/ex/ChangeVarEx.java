package scanner.ex;

/**
 * 문제 - 변수 값 교환<p>
 * 변수 `a=10` 이 들어있고, `b=20` 이 들어있다.<p>
 * 변수 `a`의 값 과 변수`b`의 값을 서로 바꾸어라<p>
 * 다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다. 힌트: `temp` 변수를활용해야한다.
 */
public class ChangeVarEx {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp; // 임시변수

    // temp 변수를 이용해서 a와 b의 값을 교환
    temp = a; // temp -> a (10 대입)
    a = b; // b-> a
    b = temp; // temp -> b

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}