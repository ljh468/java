package method.test;

/**
 * 문제. 두 개의 숫자를 받아 첫 번째 숫자에서 두 번째 숫자를 나눈 몫을 반환하는 `divide(int num1, int num2)` 메서드를 작성하세요.<p>
 * 단, 두 번째 숫자가 0일 경우 "Cannot divide by zero"라는 메시지를 출력하는 방식으로 예외 처리를 하세요.
 */
public class Test01 {

  public int divide(int num1, int num2) {
    if (num2 == 0) {
      System.out.println("Cannot divide by zero");
      return 0; // 0을 반환하거나 예외를 던질 수 있다.
    }
    return num1 / num2;
  }
}
