package scanner.ex;

import java.util.Scanner;

/**
 * 문제 - 사이 숫자<p>
 * 사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.<p>
 * 사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 `num1` 이어야 합니다.<p>
 * 사용자에게 두 번째 숫자를 입력받으세요. 변수의 이름은 `num2` 이어야 합니다.<p>
 * 만약 첫번째숫자 `num1`이 두번째숫자 `num2` 보다 크다면, 두 숫자를 교환하세요.<p>
 * 참고: 교환을 위해 임시 변수 사용을 고려하세요.<p>
 * `num1` 부터 `num2` 까지의 각 숫자를 출력하세요. 출력 결과에 유의하세요.<p>
 * <p>
 * - ex:
 * - 첫 번째 숫자를 입력하세요: 7<p>
 * - 두 번째 숫자를 입력하세요: 5<p>
 * - 두 숫자 사이의 모든 정수: 5,6,7
 */
public class ScannerEx5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("첫 번째 숫자를 입력하세요: ");
    int num1 = scanner.nextInt();

    System.out.print("두 번째 숫자를 입력하세요: ");
    int num2 = scanner.nextInt();

    System.out.println("num1 = " + num1 + ", num2 = " + num2);

    // num1이 num2보다 큰 경우, 두 숫자를 교환
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
      System.out.println("교환 : num1 = " + num1 + ", num2 = " + num2);
    }

    System.out.print("두 숫자 사이의 모든 정수: ");
    for (int i = num1; i <= num2; i++) {
      System.out.print(i); // 출력
      // num2가 첫자리 or 끝자리인 경우 ","를 생략
      if (i != num2) {
        System.out.print(",");
      }
    }
  }
}
