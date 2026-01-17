package thread.executor.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;

public class SunTaskMainV2_Bad {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        // Future를 잘못 활용한 예
        ExecutorService es = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();

        Future<Integer> future1 = es.submit(task1); // non-blocking
        Integer sum1 = future1.get();               // blocking, 2초 대기

        Future<Integer> future2 = es.submit(task2); // non-blocking
        Integer sum2 = future2.get();               // blocking, 2초 대기

        long endTime = System.currentTimeMillis();
        log("작업에 걸린 시간: " + (endTime - startTime) / 1_000.0 + "초"); // 나누기 1000

        log("task1.result=" + sum1);
        log("task2.result=" + sum2);

        int sumAll = sum1 + sum2;
        log("task1 + task2 = " + sumAll);
        log("END");
        es.close();
        /**
         * [pool-1-thread-1] 작업시작
         * [pool-1-thread-1] 작업완료 result = 1275
         * [pool-1-thread-2] 작업시작
         * [pool-1-thread-2] 작업완료 result = 3775
         * [     main] 작업에 걸린 시간: 4.022초
         * [     main] task1.result=1275
         * [     main] task2.result=3775
         * [     main] task1 + task2 = 5050
         * [     main] END
         */
    }

    static class SumTask implements Callable<Integer> {

        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws InterruptedException {
            log("작업시작");
            Thread.sleep(2000);

            int sum = 0;

            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }

            log("작업완료 result = " + sum);
            return sum;
        }
    }
}
