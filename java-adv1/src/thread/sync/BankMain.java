package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankMain {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccountV1(1000);

        Thread t1 = new Thread(new WithdrawTask(account, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 800), "t2");

        // 출금 시작
        t1.start();
        t2.start();

        sleep(500); // 검증 완료까지 대기

        log("t1 state: " + t1.getState());
        log("t2 state: " + t1.getState());

        t1.join();
        t2.join();

        log("최종 잔액: " + account.getBalance());
        /**
         * ### 문제가 발생한 결과 ###
         * [       t1] [출금 완료] 출금액: 800, 잔액: -600
         * [       t1] 거래 종료
         * [       t1] [출금 완료] 출금액: 800, 잔액: 200
         * [       t1] 거래 종료
         * [     main] 최종 잔액: -600
         */

        System.out.println("######################################################");
        BankAccount account2 = new BankAccountV2(1000);

        Thread t3 = new Thread(new WithdrawTask(account2, 800), "t3");
        Thread t4 = new Thread(new WithdrawTask(account2, 800), "t4");

        // 출금 시작
        t3.start();
        t4.start();

        sleep(500); // 검증 완료까지 대기

        log("t3 state: " + t3.getState());
        log("t4 state: " + t4.getState());

        t1.join();
        t2.join();

        log("최종 잔액: " + account2.getBalance());

    }
}
