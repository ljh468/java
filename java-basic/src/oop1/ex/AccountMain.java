package oop1.ex;

/**
 * 문제2 - 객체 지향 계좌 은행 계좌를 객체로 설계해야 한다.<p>
 * `Account` 클래스를 만들어라.<p>
 * - `int balance` 잔액<p>
 * - `deposit(int amount)` : 입금 메서드<p>
 * --- 입금시 잔액이 증가한다.<p>
 * - `withdraw(int amount)` : 출금 메서드<p>
 * --- 출금시 잔액이 감소한다.<p>
 * --- 만약 잔액이 부족하면  잔액 부족을 출력해야 한다.<p>
 */
public class AccountMain {

  public static void main(String[] args) {
    Account account = new Account();
    account.deposit(10000);
    account.withdraw(9000);
    account.withdraw(2000); // "잔액 부족" 메시지 출력
    System.out.println("잔고: " + account.balance);
  }
}
