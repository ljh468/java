package array.ex;

import java.util.Scanner;

/**
 * 문제 - 배열의 입력과 출력<p>
 * 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.<p>
 * 출력시 출력 포맷은 1, 2, 3, 4, 5 와같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야한다.<p>
 * 실행 결과 예시를 참고하자.
 * <p>
 * ex:<p>
 * 5개의 정수를 입력하세요: 1<p>
 * 2<p>
 * 3<p>
 * 4<p>
 * 5<p>
 * 출력<p>
 * 1, 2, 3, 4, 5<p>
 */
public class ArrayEx2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];

    System.out.println("5개의 정수를 입력하세요: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    System.out.println("출력");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]);
      if (i < numbers.length - 1) {
        System.out.print(", ");
      }
    }
  }
}
