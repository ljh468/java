package loop.test;

import java.util.Scanner;

/**
 * 문제9. 중첩 반복문을 이용하여 다음과 같은 모양의 피라미드를 출력하세요 (층 수는 유동적으로 설정 가능해야 합니다).
 *
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 */
public class Test09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("층 수를 입력하세요.: ");
    int levels = scanner.nextInt();

    // 각 층 반복
    for (int i = 1; i <= levels; i++) {
      // 왼쪽 공백을 층 수에 맞게 출력
      for (int j = 1; j <= levels - i; j++) { // 처음 3 -> 2 -> 1 -> 0
        System.out.print(" ");
      }
      // 현재 층의 숫자와 공백을 함께 출력 (숫자의 개수는 층의 개수)
      for (int k = 1; k <= i; k++) {
        System.out.print(i + " ");
      }
      System.out.println(); // 한 층이 끝나면 줄바꿈
    }
  }
}
