package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 문제3 - 합계와 평균<p>
 * 사용자에게 `n` 개의 정수를 입력받아서 `List` 에 보관하고,<p>
 * 보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하자.<p>
 */
public class ListEx3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("n개의 정수를 입력하세요 (종료 0)");
    while (true) {
      int input = scanner.nextInt();
      if (input == 0) {
        break;
      }
      numbers.add(input);
    }

    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }
    double average = (double) sum / numbers.size();

    System.out.println("입력한 정수의 합계: " + sum);
    System.out.println("입력한 정수의 평균: " + average);
  }
}