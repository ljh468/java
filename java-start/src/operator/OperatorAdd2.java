package operator;

/**
 * `++a` : 증감 연산자를 피연산자 앞에, 전위(Prefix) 증감 연산자
 * - a의 값을 먼저 증가시키고, 그 결과를 대입
 *
 * `a++` : 증감 연산자가 피연산자 뒤에, 후위(Postfix) 증감 연산자
 * - a의 현재 값을 먼저 대입하고, 그 후 a 값을 증가시킴
 *
 * 증감 연산자를 단독으로 사용하는 경우에는 다른 연산이 없기 때문에, 본인의 값만 증가한다.
 * 따라서 전위이든 후위이든 둘다 결과가 같다.
 */
public class OperatorAdd2 {

  public static void main(String[] args) {

    // 전위 증감 연산자 사용 예
    int a = 1;
    int b = 0;

    // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
    b = ++a;
    System.out.println("a = " + a + ", b = " + b); // 결과: a = 2, b = 2

    // 후위 증감 연산자 사용 예
    // a, b값 초기화
    a = 1;
    b = 0;

    // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
    b = a++;
    System.out.println("a = " + a + ", b = " + b); // 결과: a = 2, b = 1
  }
}
