package cond.ex;

import java.util.Scanner;

/**
 * 문제. 숫자를 입력받아 그 숫자가 짝수인지 홀수인지 판별하는 코드를 작성하세요. (힌트: 조건문과 나머지 연산 `%`을 활용하세요.)
 */
public class Test01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자를 입력하세요: ");
    int num = scanner.nextInt();

    if (num % 2 == 0) {
      System.out.println("짝수 입니다.");
    } else {
      System.out.println("홀수 입니다.");
    }
  }
}
