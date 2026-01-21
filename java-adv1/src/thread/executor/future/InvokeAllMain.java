package thread.executor.future;

import thread.executor.CallableTask;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;

public class InvokeAllMain {

    public static void main(String[] args) throws ExecutionException,
                                                  InterruptedException {

        // Thread 10개 생성
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask task1 = new CallableTask("task1", 1000); // 1초
        CallableTask task2 = new CallableTask("task2", 2000); // 2초
        CallableTask task3 = new CallableTask("task3", 3000); // 3초

        List<CallableTask> tasks = List.of(task1, task2, task3);

        log("invokeAll 호출 = 모두 끝나야 값을 전체 반환");
        List<Future<Integer>> futures = es.invokeAll(tasks);

        for (Future<Integer> future : futures) {
            Integer value = future.get();
            log("value = " + value);
        }

        es.close();
    }
}