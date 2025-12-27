package thread.cas;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CasMainV3 {
    private static final int THREAD_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        Runnable runnable = () -> incrementAndGet(atomicInteger);

        // 쓰레드 생성 & 실행
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        // 쓰레드가 모두 끝날때까지 기다림
        for (Thread thread : threads) {
            thread.join();
        }

        // 결과 출력
        int result = atomicInteger.get();
        System.out.println(atomicInteger.getClass().getSimpleName() + "resultValue: " + result);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;

        do {
            getValue = atomicInteger.get();
            // sleep(100); // 쓰레드 동시 실행을 위한 대기
            log("getValue: " + getValue);

            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result: " + result);

        } while (!result);

        return getValue + 1;
    }
}
