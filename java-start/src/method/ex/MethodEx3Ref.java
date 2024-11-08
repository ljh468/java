package method.ex;

/**
 * 문제 - 입출금 리펙토링<p>
 * 다음은 입금, 출금을 나타내는 코드이다.<p>
 * 입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자.
 */
public class MethodEx3Ref {

  public static void main(String[] args) {
    int balance = 10000; // 잔액: 10000

    System.out.println("기존 잔액: " + balance + "원");
    balance = deposit(balance, 1000); // 1000원 입금
    balance = withdraw(balance, 2000); // 2000원 출금
    System.out.println("최종 잔액: " + balance + "원");
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