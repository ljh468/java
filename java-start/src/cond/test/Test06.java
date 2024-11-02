package cond.test;

import java.util.Scanner;

/**
 * 문제. 연도를 입력받아 해당 연도가 윤년인지 아닌지를 판단하는 코드를 작성하세요. 윤년의 조건은 다음과 같습니다.<p>
 * - 연도가 4로 나누어떨어지고, 100으로 나누어떨어지지 않는 경우<p>
 * - 혹은 400으로 나누어떨어지는 경우<p>
 */
public class Test06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("연도를 입력하세요: ");
    int year = scanner.nextInt();

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      System.out.println(year + "년은 윤년입니다.");
    } else {
      System.out.println(year + "년은 평년입니다.");
    }
  }
}
