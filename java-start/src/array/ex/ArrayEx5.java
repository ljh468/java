package array.ex;

import java.util.Scanner;

/**
 * 문제 - 합계와 평균2<p>
 * 이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.<p>
 * 실행 결과 예시를 참고하자<p>
 *
 * ex:<p>
 * 입력받을 숫자의 개수를 입력하세요:3<p>
 * 3개의 정수를 입력하세요:<p>
 * 1<p>
 * 2<p>
 * 3<p>
 * 입력한 정수의 합계: 6<p>
 * 입력한 정수의 평균: 2.0<p>
 */
public class ArrayEx5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
    int count = scanner.nextInt();

    int[] numbers = new int[count];
    int sum = 0;
    double average;

    System.out.println(count + "개의 정수를 입력하세요: ");
    for (int i = 0; i < count; i++) {
      numbers[i] = scanner.nextInt();
      sum += numbers[i];
    }

    average = (double) sum / count;
    System.out.println("입력한 정수의 합계: " + sum);
    System.out.println("입력한 정수의 평균: " + average);
  }
}
