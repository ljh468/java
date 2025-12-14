package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.log;

public class BoundedQueueV5 implements BoundedQueue {

    private final Lock lock = new ReentrantLock();

    private final Condition producerCond = lock.newCondition(); // 생산자 대기 집합

    private final Condition consumerCond = lock.newCondition(); // 소비자 대기 집합

    private final Queue<String> queue = new ArrayDeque<>();

    private final int max;


    public BoundedQueueV5(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {

        // 락 획득
        lock.lock();
        try {

            while (queue.size() == max) {
                log("[put] 큐가 가득참, 생산자 대기");
                try {

                    producerCond.await(); // RUNNABLE -> WAITING, 락 반납 -> 생산자 대기큐에 저장
                    log("[put] 생산자 깨어남");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            queue.offer(data);

            // 소비자 깨우기
            log("[put] 생산자 데이터 저장, consumerCond.signal() 호출");
            consumerCond.signal(); // 소비자 대기 집합에서 대기하고 있는 쓰레드를 깨움

        } finally {
            // 락 해제
            lock.unlock();
        }

    }

    @Override
    public String take() {

        lock.lock();

        try {

            while (queue.isEmpty()) {
                log("[take] 큐에 데이터가 없음, 소비자 대기");
                try {

                    consumerCond.await(); // RUNNABLE -> WAITING, 락 반납 -> 소비자 대기큐에 저장
                    log("[take] 소비자 깨어남");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            String data = queue.poll();
            log("[take] 소비자 데이터 획득, producerCond.signal() 호출");
            producerCond.signal(); // Condition에 대기하고 있는 쓰레드를 깨움

            return data;

        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
