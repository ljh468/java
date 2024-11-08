package method.ex;

import java.util.Scanner;

/**
 * 문제 - 은행 계좌 입출금<p>
 * 다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자. 또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자<p>
 * 출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
 * <p>
 * ex:<p>
 * ---------------------------------<p>
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료<p>
 * ---------------------------------<p>
 * 선택: 1<p>
 * 입금액을 입력하세요: 10000<p>
 * 10000원을 입금하였습니다. 현재 잔액: 10000원<p>
 * ---------------------------------<p>
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료<p>
 * ---------------------------------<p>
 * 선택: 2<p>
 * 출금액을 입력하세요: 8000<p>
 * 8000원을 출금하였습니다. 현재 잔액: 2000원<p>
 * ---------------------------------<p>
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료<p>
 * ---------------------------------<p>
 * 선택: 2<p>
 * 출금액을 입력하세요: 3000<p>
 * 3000원을 출금하려 했으나 잔액이 부족합니다.<p>
 * ---------------------------------<p>
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료<p>
 * ---------------------------------<p>
 * 선택: 3<p>
 * 현재 잔액: 2000원<p>
 * ---------------------------------<p>
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료<p>
 * ---------------------------------<p>
 * 선택: 4<p>
 * 시스템을 종료합니다.<p>
 */
public class MethodEx4 {

  public static void main(String[] args) {
    int balance = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("---------------------------------");
      System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
      System.out.println("---------------------------------");
      System.out.print("선택: ");

      int option = scanner.nextInt();
      int amount;

      switch (option) {
        case 1 -> {
          System.out.print("입금액을 입력하세요: ");
          amount = scanner.nextInt();
          balance = deposit(balance, amount);
        }
        case 2 -> {
          System.out.print("출금액을 입력하세요: ");
          amount = scanner.nextInt();
          balance = withdraw(balance, amount);
        }
        case 3 -> System.out.println("현재 잔액: " + balance + "원");
        case 4 -> {
          System.out.println("시스템을 종료합니다.");
          return; // main 메서드 종료
        }
        default -> System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
      }

    }

  }

  public static int deposit(int balance, int amount) {
    balance += amount;
    System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    return balance;
  }

  public static int withdraw(int balance, int amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
    } else {
      System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
    }

    return balance;
  }

}
