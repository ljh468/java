package loop.ex;

/**
 * 문제: 짝수 출력<p>
 * 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, `num` 이라는 변수를 사용하여 수를 표현해야 합니다.<p>
 * for문 버전의 정답을 만들어야 합니다.<p>
 */
public class ForEx2 {

  public static void main(String[] args) {
    // 초기식과 증감식은 여러개 선언할 수 있다.
    // 그러나 용도에 맞게 사용하는 것이 좋다. (여기서 for문의 용도는 count변수의 증가시키는 용도)
    for (int num = 2, count = 1; count <= 10; num += 2, count++) {
      System.out.println(num);
    }
    System.out.println();

    // 가독성있게 변경
    int num = 2;
    for (int count = 1; count <= 10; count++) {
      System.out.println(num);
      num += 2;
    }
  }
}
