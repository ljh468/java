package example03;

import static util.MyLogger.log;

public class SyncTest2BadMain {

    public static void main(String[] args) throws InterruptedException {

        MyCounter myCounter = new MyCounter();
        Runnable task = myCounter::count;

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class MyCounter {

        public void count() {

            // localValue` 지역 변수는 각기 다른 스택프레임에 할당되기 때문에, 동시성 문제가 발생하지 않는다.
            int localValue = 0;

            for (int i = 0; i < 1000; i++) {
                localValue = localValue + 1;
            }

            log("결과: " + localValue);
        }

    }

}