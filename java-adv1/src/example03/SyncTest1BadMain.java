package example03;

public class SyncTest1BadMain {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("결과: " + counter.getCount());
        /**
         * == 기대하는 실행 결과 ==
         * 결과: 20000
         */
    }

    static class Counter {

        private int count = 0;

        // 풀이는 synchronized 키워드를 붙혀서 공유자원에 동시에 쓰레드가 접근하지 못하게 하는 것
        public synchronized void increment() {
            count = count + 1;
        }

        public synchronized int getCount() {
            return count;
        }
    }
}