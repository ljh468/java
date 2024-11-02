package loop.test;

/**
 * 문제6. 중첩 반복문을 사용하여 다음과 같은 곱셈표를 출력하세요 (1부터 5까지).
 *
 * 1  2  3  4  5
 * 2  4  6  8 10
 * 3  6  9 12 15
 * 4  8 12 16 20
 * 5 10 15 20 25
 */
public class Test06 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j == 1) {
          // 첫 번째 숫자는 공백 없이 출력
          System.out.print(i * j);
        } else {
          // 그 외 숫자는 너비 2로 맞춤
          System.out.printf("%3d", i * j);
        }
      }
      System.out.println();
    }
  }
}
