package thread.sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV6 implements BankAccount {

    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankAccountV6(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        // 0.5초 동안만 락 획득을 시도하고, 실패하면 포기함
        // InterruptedException 발생 가능
        try {
            if (!lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                log("[진입 실패] 이미 처리중인 작업이 있습니다.");
                return false;
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // ReentrantLock 이용하여 lock을 걸기
        lock.lock();

        try {
            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);

            if (balance < amount) {
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }


            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000);

            balance -= amount; // 출금

            log("[출금 완료] 출금액: " + amount + ", 변경 잔액: " + balance);

        } finally {
            // ReentrantLock 이용하여 lock 해제 (무조건 호출되어야 함)
            lock.unlock();
        }

        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {

        // ReentrantLock 이용하여 lock 걸기
        lock.lock();

        try {
            return balance;
        } finally {
            // ReentrantLock 이용하여 lock 해제
            lock.unlock();
        }

    }
}