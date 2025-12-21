package thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger implements IncrementInteger {

    // AtomicInteger는 동시성 코드가 내부에 모두 구현되어 있음
    AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void increment() {
        atomicInteger.incrementAndGet();
    }

    @Override
    public int get() {
        return atomicInteger.get();
    }
}
