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

        log("최종 잔액: " + account3.getBalance());
        /**
         * ### synchronized 최적화 ###
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

        sleep(100);
        System.out.println("######################################################");
        BankAccount account4 = new BankAccountV4(1000);

        Thread t7 = new Thread(new WithdrawTask(account4, 800), "t7");
        Thread t8 = new Thread(new WithdrawTask(account4, 800), "t8");

        // 출금 시작
        t7.start();
        t8.start();

        sleep(500); // 검증 완료까지 대기

        log("t7 state: " + t7.getState());
        log("t8 state: " + t8.getState());

        t7.join();
        t8.join();

        log("최종 잔액: " + account4.getBalance());
        /**
         * ### ReentrantLock 활용 ###
         * [       t8] 거래 시작: BankAccountV4
         * [       t7] 거래 시작: BankAccountV4
         * [       t8] [검증 시작] 출금액: 800, 잔액: 1000
         * [       t8] [검증 완료] 출금액: 800, 잔액: 1000
         * [     main] t7 state: WAITING
         * [     main] t8 state: TIMED_WAITING
         * [       t8] [출금 완료] 출금액: 800, 변경 잔액: 200
         * [       t8] 거래 종료
         * [       t7] [검증 시작] 출금액: 800, 잔액: 200
         * [       t7] [검증 실패] 출금액: 800, 잔액: 200
         * [     main] 최종 잔액: 200
         */

        sleep(100);
        System.out.println("######################################################");
        BankAccount account5 = new BankAccountV5(1000);

        Thread t9 = new Thread(new WithdrawTask(account5, 800), "t9");
        Thread t10 = new Thread(new WithdrawTask(account5, 800), "t10");

        // 출금 시작
        t9.start();
        t10.start();

        sleep(500); // 검증 완료까지 대기

        log("t9 state: " + t9.getState());
        log("t10 state: " + t10.getState());

        t9.join();
        t10.join();

        log("최종 잔액: " + account5.getBalance());
        /**
         * ### tryLock() 활용 ###
         * [       t9] 거래 시작: BankAccountV5
         * [      t10] 거래 시작: BankAccountV5
         * [      t10] [진입 실패] 이미 처리중인 작업이 있습니다.
         * [       t9] [검증 시작] 출금액: 800, 잔액: 1000
         * [       t9] [검증 완료] 출금액: 800, 잔액: 1000
         * [     main] t9 state: TIMED_WAITING
         * [     main] t10 state: TERMINATED
         * [       t9] [출금 완료] 출금액: 800, 변경 잔액: 200
         * [       t9] 거래 종료
         * [     main] 최종 잔액: 200
         */

        sleep(100);
        System.out.println("######################################################");
        BankAccount account6 = new BankAccountV6(1000);

        Thread t11 = new Thread(new WithdrawTask(account6, 800), "t11");
        Thread t12 = new Thread(new WithdrawTask(account6, 800), "t12");

        // 출금 시작
        t11.start();
        t12.start();

        sleep(500); // 검증 완료까지 대기

        log("t11 state: " + t11.getState());
        log("t12 state: " + t12.getState());

        t11.join();
        t12.join();

        log("최종 잔액: " + account6.getBalance());
        /**
         * ### lock.tryLock(ms, TimeUnit.MILLISECONDS) 활용 ###
         * [      t11] 거래 시작: BankAccountV6
         * [      t12] 거래 시작: BankAccountV6
         * [      t11] [검증 시작] 출금액: 800, 잔액: 1000
         * [      t11] [검증 완료] 출금액: 800, 잔액: 1000
         * [     main] t11 state: TIMED_WAITING
         * [     main] t12 state: TIMED_WAITING
         * [      t12] [진입 실패] 이미 처리중인 작업이 있습니다.
         * [      t11] [출금 완료] 출금액: 800, 변경 잔액: 200
         * [      t11] 거래 종료
         * [     main] 최종 잔액: 200
         */
    }
}
