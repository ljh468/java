package method;

public class MethodValue1 {

  public static void main(String[] args) {
    int num1 = 5;
    System.out.println("1. changeNumber 호출 전, num1: " + num1);
    // `num1` 의값 5를 읽고 복사해서 `num2` 에 전달
    changeNumber(num1);

    // 대원칙 : 자바는 항상 변수의 값을 복사해서 대입한다.
    System.out.println("4. changeNumber 호출 후, num1: " + num1);
  }

  public static void changeNumber(int num2) {
    System.out.println("2. changeNumber 변경 전, num2: " + num2);
    num2 = num2 * 2;
    System.out.println("3. changeNumber 변경 후, num2: " + num2);
  }
}
