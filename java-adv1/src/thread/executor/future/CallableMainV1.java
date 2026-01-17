package thread.executor.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CallableMainV1 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future = es.submit(new MyCallable());

        Integer result = future.get();
        log("result valude = " + result);
        es.close();
        /**
         * [pool-1-thread-1] Callable 시작
         * [pool-1-thread-1] create value = 10
         * [pool-1-thread-1] Callable 완료
         * [     main] result valude = 10
         */
    }

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() {
            log("Callable 시작");

            sleep(2000);
            int value = new Random().nextInt(1, 11);
            log("create value = " + value);

            log("Callable 완료");
            return value;
        }
    }
}
