package operator;

public class Operator1 {

  public static void main(String[] args) { // 변수 초기화
    int a = 5;
    int b = 2;
    // 덧셈
    int sum = a + b;
    System.out.println("a + b = " + sum); // 출력: a + b = 7
    // 뺄셈
    int diff = a - b;
    System.out.println("a - b = " + diff); // 출력: a - b = 3
    // 곱셈
    int multi = a * b;
    System.out.println("a * b = " + multi); // 출력: a * b = 10
    // 나눗셈
    int div = a / b;
    System.out.println("a / b = " + div); // 출력: a / b = 2
    // 나머지
    int mod = a % b;
    System.out.println("a % b = " + mod); // 출력: a % b = 1

    // 주의! 0 으로 나누면 컴파일 에러가 발생한다.
    // 컴파일 에러 : Exception in thread "main" java.lang.ArithmeticException: / by zero
    // int zeroDivision = 10 / 0;
  }
}
