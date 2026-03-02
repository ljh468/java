package thread.executor.poolsize;

import thread.executor.RunnableTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExcutorUtils.printState;
import static util.MyLogger.log;

public class PoolSizeMainV2 {

    // NOTE: 고정 풀 전략
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        // ExecutorService es =
        // new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        log("== pool 생성 ==");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        es.close();

        log("== shutdown 완료 ==");
    }
    /**
     * [     main] == pool 생성 ==
     * [     main] [pool=0, active=0, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-1] task1 시작
     * [     main] task1 -> [pool=1, active=1, queuedTasks=0, completedTasks=0]
     * [     main] task2 -> [pool=2, active=2, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-2] task2 시작
     * [     main] task3 -> [pool=2, active=2, queuedTasks=1, completedTasks=0]
     * [     main] task4 -> [pool=2, active=2, queuedTasks=2, completedTasks=0]
     * [     main] task5 -> [pool=2, active=2, queuedTasks=3, completedTasks=0]
     * [     main] task6 -> [pool=2, active=2, queuedTasks=4, completedTasks=0]
     * [pool-1-thread-1] task1 완료
     * [pool-1-thread-1] task3 시작
     * [pool-1-thread-2] task2 완료
     * [pool-1-thread-2] task4 시작
     * [pool-1-thread-1] task3 완료
     * [pool-1-thread-1] task5 시작
     * [pool-1-thread-2] task4 완료
     * [pool-1-thread-2] task6 시작
     * [pool-1-thread-1] task5 완료
     * [pool-1-thread-2] task6 완료
     * [     main] == shutdown 완료 ==
     */
}
