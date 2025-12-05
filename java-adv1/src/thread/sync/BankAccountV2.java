package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV2 implements BankAccount {

    private int balance; // 공유자원

    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    // ** 임계영역은 쓰레드가 동시에 접근하면 데이터 불일치, 예상치 못한 동작이 발생할 수 있는 중요한 코드 부분을 뜻함 **
    // 임계영역을 보호하기 위해 synchronized 키워드를 사용
    @Override
    public synchronized boolean withdraw(int amount) {

        log("거래 시작: " + getClass().getSimpleName());

        // 1. 잔액 검증하기
        log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
        if (balance < amount) {
            log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
            return false;
        }

        // 2. 출금하기
        log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
        sleep(1000); // 출금에 걸리는 시간으로 가정
        balance -= amount; // 출금

        log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
