package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BoundedQueueV6_4 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_4(int max) {
        // 고정 크기 지정
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        // java.lang.IllegalStateException: Queue full
        queue.add(data);
    }

    @Override
    public String take() {
        // java.util.NoSuchElementException
        return queue.remove();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
