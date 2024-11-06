package scanner.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ## 초급(간단한 계산기)<p>
 * <p>
 * 사용자로부터 두 개의 숫자와 연산자를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 계산기 프로그램을 만드세요.<p>
 * - ** 사용자 입력 요구: ** 숫자 두 개와 연산자(+, -, *, /)를 입력받습니다.<p>
 * - ** 프로그램 동작: ** 입력된 연산자에 따라 적절한 계산을 수행하고 결과를 출력합니다.<p>
 * - ** 예외 처리: ** 나누기 연산 시 0으로 나누는 경우 오류 메시지를 출력합니다.
 */
public class 간단한_계산기 {

  public static double calculation(double num1, double num2, String operator) {
    return switch (operator) {
      case "+" -> num1 + num2;
      case "-" -> num1 - num2;
      case "*" -> num1 * num2;
      case "/" -> {
        if (num2 == 0) {
          System.out.println("0으로 나눌 수 없습니다.");
          throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } else {
          yield num1 / num2;
        }
      }
      default -> {
        throw new RuntimeException("올바르지 않은 연산자 입력입니다. 연산자: " + operator);
      }
    };
  }

  private static boolean checkExit(String input) {
    if (input.equalsIgnoreCase("exit")) {
      System.out.println("프로그램을 종료합니다.");
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      while (true) {

        double num1;
        double num2;
        String operator;

        // 첫 번째 숫자 입력
        while (true) {
          System.out.print("첫번째 숫자를 입력하세요 (\"exit\"를 입력하면 종료): ");
          String input1 = bufferedReader.readLine();
          if (checkExit(input1)) {
            return;
          }
          try {
            num1 = Double.parseDouble(input1);
            break;
          } catch (NumberFormatException numberFormatException) {
            System.out.println("유효한 숫자를 입력해주세요.");
          }
        }

        // 두 번째 숫자 입력
        while (true) {
          System.out.print("두번째 숫자를 입력하세요 (\"exit\"를 입력하면 종료): ");
          String input2 = bufferedReader.readLine();
          if (checkExit(input2)) {
            return;
          }
          try {
            num2 = Double.parseDouble(input2);
            break;
          } catch (NumberFormatException numberFormatException) {
            System.out.println("유효한 숫자를 입력해주세요.");
          }
        }

        // 연산자 입력
        while (true) {
          System.out.print("연산자(+, -, *, /)를 입력하세요. (\"exit\"를 입력하면 종료): ");
          operator = bufferedReader.readLine();
          if (checkExit(operator)) {
            return;
          }
          try {
            System.out.println("계산결과: " + calculation(num1, num2, operator));
            break;
          } catch (RuntimeException runtimeException) {
            System.out.println(runtimeException.getMessage());
          }
        }

      }

    } catch (Exception exception) {
      System.out.println("프로그램 실행 중 오류가 발생했습니다. 종료합니다.");
    }

  }

}
