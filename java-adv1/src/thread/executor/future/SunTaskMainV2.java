package thread.executor.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;

public class SunTaskMainV2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = es.submit(task1);
        Future<Integer> future2 = es.submit(task2);

        Integer sum1 = future1.get();
        Integer sum2 = future2.get();
        log("task1.result=" + sum1);
        log("task2.result=" + sum2);

        int sumAll = sum1 + sum2;
        log("task1 + task2 = " + sumAll);
        log("END");
        es.close();
        /**
         * [pool-1-thread-1] 작업시작
         * [pool-1-thread-2] 작업시작
         * [pool-1-thread-2] 작업완료 result = 3775
         * [pool-1-thread-1] 작업완료 result = 1275
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
