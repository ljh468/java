package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class LockSupportMainV1 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        // 잠시 대기 (park 상태에 빠질 시간 벌기)
        sleep(100);

        log("Thread-1 state: " + thread1.getState()); // WAITING


        // 대기 중인 thread1을 깨움 (RUNNABLE)
        // log("main -> unpark(Thread-1)");
        // LockSupport.unpark(thread1); // unpark(thread) 사용

        /*
         * ## unpark() 결과 ##
         * [ Thread-1] park 시작
         * [     main] Thread-1 state: WAITING
         * [     main] main -> unpark(Thread-1)
         * [ Thread-1] park 종료, state: RUNNABLE
         * [ Thread-1] 인터럽트 상태: false
         */

        ///////////////////////////////////////////////////////////////////////////

        log("main -> interrupt(Thread-1)");
        thread1.interrupt(); // interrupt() 사용

        /*
         * ## interrupt() 결과 ##
         * [ Thread-1] park 시작
         * [     main] Thread-1 state: WAITING
         * [ Thread-1] park 종료, state: RUNNABLE
         * [ Thread-1] 인터럽트 상태: true
         */

    }

    static class ParkTest implements Runnable {

        @Override
        public void run() {
            log("park 시작");

            LockSupport.park(); // 쓰레드 대기 상태로 변경(WAITING)

            // main 쓰레드에 의해 unpark가 발생 -> RUNNABLE 상태로 변경
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}
