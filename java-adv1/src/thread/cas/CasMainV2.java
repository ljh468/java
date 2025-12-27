package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.log;

public class CasMainV2 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        // incrementAndGet 직접 구현
        int resultValue1 = incrementAndGet(atomicInteger);
        System.out.println("resultValue1 = " + resultValue1);

        int resultValue2 = incrementAndGet(atomicInteger);
        System.out.println("resultValue2 = " + resultValue2);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;

        do {
            // atomicInteger안에 있는 value가 조회한 시점부터
            getValue = atomicInteger.get();
            log("getValue: " + getValue);

            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            // atomicInteger안에 있는 value의 값이 compareAndSet으로 확인한 시점까지 아무도 변경하지 않았다면 값을 증가 시킬꺼야.
        } while (!result);

        // 만약 CAS 연산이 성공한다면 `true` 를 반환하고 `do~while` 문을 빠져나온다.
        // 만약 CAS 연산이 실패한다면 `false` 를 반환하고 `do~while` 문을 다시 시작한다.
        // 중요: atomicInteger.get()은 다른 쓰레드가 값을 변경할 수 있기 때문에 getValue + 1을 반환해야 한다.
        return getValue + 1;
    }
}
