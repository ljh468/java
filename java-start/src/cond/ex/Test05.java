package cond.ex;

import java.util.Scanner;

/**
 * 문제. 월(month) 값을 입력받아 해당 월이 속한 계절을 출력하는 코드를 작성하세요.<p>
 * 예를 들어, 3월~5월은 “봄”,  6월~8월은 "여름"으로 처리하며, `switch`문을 사용하여 구현하세요.
 */
public class Test05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("해당 월(month)을 입력하세요: ");
    int month = scanner.nextInt();
    switch (month) {
      case 3, 4, 5 -> System.out.println("그대는 봄인가보오.");
      case 6, 7, 8 -> System.out.println("여름은 서핑이다.");
      case 9, 10, 11 -> System.out.println("가을은 단풍이 아름다워요.");
      case 12, 1, 2 -> System.out.println("겨울은 눈이 내려요.");
      default -> System.out.println("올바르지 않은 월(month)입니다.");
    }
  }
}
