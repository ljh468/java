package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class LockSupportMainV2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        // 잠시 대기 (park 상태에 빠질 시간 벌기)
        sleep(100);

        log("Thread-1 state: " + thread1.getState()); // WAITING

        /**
         * ## parkNanos 결과 ##
         * 18:42:42 [ Thread-1] park 시작
         * 18:42:42 [     main] Thread-1 state: TIMED_WAITING
         * 18:42:44 [ Thread-1] park 종료, state: RUNNABLE
         * 18:42:44 [ Thread-1] 인터럽트 상태: false
         */
    }

    static class ParkTest implements Runnable {

        @Override
        public void run() {
            log("park 시작");

            LockSupport.parkNanos(2000_000000); // 20억 나노초 (2초)

            // parkNanos()에 의해 2초뒤에 RUNNABLE 상태로 변경
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}