package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV3 implements BankAccount {

    private int balance; // 공유자원

    public BankAccountV3(int initialBalance) {
        this.balance = initialBalance;
    }

    // withdraw()` 메서드 앞에 사용하던 `synchronized` 를 제거
    // synchronized (this) {}` : 안전한 임계 영역을 코드 블럭으로 지정
    @Override
    public boolean withdraw(int amount) {

        log("거래 시작: " + getClass().getSimpleName());
        // == 임계 영역 시작 ==

        synchronized (this) {

            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);

            if (balance < amount) {
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }

            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000); // 출금에 걸리는 시간으로 가정
            balance -= amount; // 출금

            log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);
        }

        // == 임계 영역 종료 ==
        log("거래 종료");

        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
