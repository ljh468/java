package cond.ex;

import java.util.Scanner;

/**
 * 문제. 세 개의 숫자를 입력받아 그 중 가장 큰 숫자를 출력하는 코드를 작성하세요. (단, `if-else`문을 사용하여 구현하세요.)
 */
public class Test02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("3개의 숫자를 입력하세요: ");
    System.out.println("첫번째 숫자는: ");
    int num1 = scanner.nextInt();
    System.out.println("두번째 숫자는: ");
    int num2 = scanner.nextInt();
    System.out.println("세번째 숫자는: ");
    int num3 = scanner.nextInt();

    int max;
    if (num1 >= num2 && num1 >= num3) {
      max = num1;
    } else if (num2 >= num1 && num2 >= num3) {
      max = num2;
    } else {
      max = num3;
    }

    System.out.println("가장 큰 숫자는 " + max + "입니다.");
  }
}
