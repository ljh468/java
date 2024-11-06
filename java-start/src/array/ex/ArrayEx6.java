package array.ex;

import java.util.Scanner;

/**
 * 문제 - 가장 작은 수, 큰 수 찾기<p>
 * 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로 그램을 작성하자.<p>
 * 실행 결과 예시를 참고하자.<p>
 * <p>
 * ex:<p>
 * 입력받을 숫자의 개수를 입력하세요:3<p>
 * 3개의 정수를 입력하세요:<p>
 * 1<p>
 * 2<p>
 * 5<p>
 * 가장 작은 정수: 1<p>
 * 가장 큰 정수: 5<p>
 */
public class ArrayEx6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
    int n = scanner.nextInt();

    int[] numbers = new int[n];
    int minNumber, maxNumber;

    System.out.println(n + "개의 정수를 입력하세요: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }

    // 첫번째 원소로 min, max 초기화
    minNumber = maxNumber = numbers[0];

    // 두번째 원소부터 순회
    for (int i = 1; i < n; i++) {
      // minNumber보다 작으면 갱신
      if (numbers[i] < minNumber) {
        minNumber = numbers[i];
      }
      // maxNumber보다 크면 갱신
      if (numbers[i] > maxNumber) {
        maxNumber = numbers[i];
      }
    }

    System.out.println("가장 작은 정수: " + minNumber);
    System.out.println("가장 큰 정수: " + maxNumber);
  }
}
