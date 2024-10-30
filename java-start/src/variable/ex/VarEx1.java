package variable.ex;

/**
 * 문제1
 * 다음 코드에 반복해서 나오는 숫자 `4` ,`3` 을 다른 숫자로 한번에 변경할 수 있도록
 * 변수 `num1` , `num2`를 사용하도록 변경해보세요.
 */
public class VarEx1 {

  public static void main(String[] args) {
    //    System.out.println(4 + 3);
    //    System.out.println(4 - 3);
    //    System.out.println(4 * 3);
    int num1 = 4;
    int num2 = 3;

    System.out.println(num1 + num2); // 7
    System.out.println(num1 - num2); // 1
    System.out.println(num1 * num2); // 12
  }
}
