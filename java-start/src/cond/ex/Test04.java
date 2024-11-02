package cond.ex;

import java.util.Scanner;

/**
 * 문제. 간단한 계산기를 만드세요.<p>
 * 두 개의 숫자와 연산자(+,-,*,/)를 입력받아 연산 결과를 출력하세요. 조건문을 사용하여 각 연산을 처리해야 합니다.
 */
public class Test04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("계산기를 실행합니다.");

    System.out.println("첫번째 숫자를 입력하세요: ");
    int num1 = scanner.nextInt();

    System.out.println("두번째 숫자를 입력하세요: ");
    int num2 = scanner.nextInt();
    scanner.nextLine(); // 개행문자 소비

    System.out.println("어떤 연산을 수행할지 입력하세요. 연산자(+, -, *, /): ");
    String operator = scanner.nextLine();

    int result = 0;
    if (operator.equals("+")) {
      result = num1 + num2;
    } else if (operator.equals("-")) {
      result = num1 - num2;
    } else if (operator.equals("*")) {
      result = num1 * num2;
    } else if (operator.equals("/")) {
      if (num2 == 0) {
        System.out.println("0으로 나눌 수 없습니다.");
      } else {
        result = num1 / num2;
      }
    } else {
      System.out.println("올바르지 않은 연산자입니다: " + operator);
    }

    if (result != 0) {
      System.out.println("(" + num1 + " " + operator + " " + num2 + ") 연산의 결과는? " + result);
    }
  }

}
