package thread.control.yield;

import static util.ThreadUtils.sleep;

public class YieldMain {

    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable(), "thread-" + i);
            thread.start();
        }

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                // 1. empty

                // 2. sleep - 계속 쓰레드가 바뀜
                // sleep(1);

                // 3. yield - 다른 쓰레드에게 양보 (적절히 분배)
                // Thread.yield();

            }
        }
    }
}
