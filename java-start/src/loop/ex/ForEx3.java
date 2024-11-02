package loop.ex;

/**
 * 문제: 누적 합 계산<p>
 * 반복문을 사용하여 1부터 `max` 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요.<p>
 * 이때, `sum` 이라는 변수를 사용하여 누적 합을 표현하고, `i` 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.<p>
 * for문 버전의 정답을 만들어야 합니다.
 */
public class ForEx3 {

  public static void main(String[] args) {
    int max = 100;

    int sum = 0;
    for (int i = 1; i <= max; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
