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
         * [       t1] 거래 시작: BankAccountV1
         * [       t2] 거래 시작: BankAccountV1
         * [       t1] [검증 시작] 출금액: 800, 잔액: 1000
         * [       t1] [검증 완료] 출금액: 800, 잔액: 1000
         * [       t2] [검증 시작] 출금액: 800, 잔액: 1000
         * [       t2] [검증 완료] 출금액: 800, 잔액: 1000
         * [     main] t1 state: TIMED_WAITING
         * [     main] t2 state: TIMED_WAITING
         * [       t1] [출금 완료] 출금액: 800, 잔액: 200
         * [       t2] [출금 완료] 출금액: 800, 잔액: -600
         * [       t2] 거래 종료
         * [       t1] 거래 종료
         * [     main] 최종 잔액: -600
         */

        sleep(100);
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
        /**
         * ### synchronized 키워드로 문제 해결 ###
         * [       t3] 거래 시작: BankAccountV2
         * [       t3] [검증 시작] 출금액: 800, 잔액: 1000
         * [       t3] [검증 완료] 출금액: 800, 잔액: 1000
         * [     main] t3 state: TIMED_WAITING
         * [     main] t4 state: BLOCKED
         * [       t3] [출금 완료] 출금액: 800, 잔액: 200
         * [       t3] 거래 종료
         * [       t4] 거래 시작: BankAccountV2
         * [     main] 최종 잔액: 200
         * [       t4] [검증 시작] 출금액: 800, 잔액: 200
         * [       t4] [검증 실패] 출금액: 800, 잔액: 200
         */


        sleep(100);
        System.out.println("######################################################");
        BankAccount account3 = new BankAccountV3(1000);

        Thread t5 = new Thread(new WithdrawTask(account3, 800), "t5");
        Thread t6 = new Thread(new WithdrawTask(account3, 800), "t6");

        // 출금 시작
        t5.start();
        t6.start();

        sleep(500); // 검증 완료까지 대기

        log("t5 state: " + t5.getState());
        log("t6 state: " + t6.getState());

        t5.join();
        t6.join();

        log("최종 잔액: " + account2.getBalance());
        /**
         * ### synchronized 최적호 ###
         * [       t6] 거래 시작: BankAccountV3
         * [       t5] 거래 시작: BankAccountV3
         * [       t6] [검증 시작] 출금액: 800, 잔액: 1000
         * [       t6] [검증 완료] 출금액: 800, 잔액: 1000
         * [     main] t5 state: BLOCKED
         * [     main] t6 state: TIMED_WAITING
         * [       t6] [출금 완료] 출금액: 800, 잔액: 200
         * [       t6] 거래 종료
         * [       t5] [검증 시작] 출금액: 800, 잔액: 200
         * [       t5] [검증 실패] 출금액: 800, 잔액: 200
         * [     main] 최종 잔액: 200
         */
    }
}
