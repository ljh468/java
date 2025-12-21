package thread.cas.increment;

import java.util.ArrayList;
import java.util.List;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class IncrementThreadMain {

    public static final int THEAD_COUNT = 1000;

    // main 스레드
    public static void main(String[] args) throws InterruptedException {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger) throws InterruptedException {

        // 1. Runnable 인터페이스 구현
        Runnable runnable = () -> {

            sleep(10); // 너무 빨리 실행되기 때문에, 동시 실행을 위해 잠깐 대기

            // value++
            incrementInteger.increment();
        };

        // 2. Thread 1000개 생성 & 동시에 1000개의 쓰레드 실행
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THEAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        // 3. 모든 쓰레드가 끝날때까지 기다림
        for (Thread thread : threads) {
            thread.join();
        }

        // 4. 결과 출력
        int result = incrementInteger.get();
        log(incrementInteger.getClass().getSimpleName() + " result:" + result);

        /**
         * #### BasicInteger ####<p>
         * 22:10:48 [     main] BasicInteger result:975<p>
         * <p>
         * #### VolatileInteger ####<p>
         * 22:13:58 [     main] VolatileInteger result:992<p>
         * <p>
         * #### SyncInteger ####<p>
         * 22:15:58 [     main] SyncInteger result:1000<p>
         * <p>
         * #### SyncInteger ####<p>
         * 22:26:07 [     main] MyAtomicInteger result:1000<p>
         * <p>
         * #### 결과 ####<p>
         * - basic, volaitle은 1000이 나오지 않고, 매번 결과도 다름<p>
         * - syncronized 키워드를 붙힌 경우에 동시성 문제가 해결되어서 결과가 1000이 나옴 (성능 느림)<p>
         * - AtomicInteger는 멀티스레드 상황에 안전하고 또 다양한 값 증가, 감소 연산을 제공한다. (성능 빠름)<p>
         * - 특정 값을 증가하거나 감소해야 하는데 여러 스레드가 해당 값을 공유해야 한다면, `AtomicXXX` 클래스를 사용하자<p>
         * - 참고 : AtomicInteger` , `AtomicLong` , `AtomicBoolean` 등 다양한 `AtomicXxx` 클래스가 존재한다.
         */
    }

}
