package thread.executor.poolsize;

import thread.executor.RunnableTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExcutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV3 {

    // NOTE: 캐시 풀 전략
    public static void main(String[] args) throws InterruptedException {
        // ExecutorService es = Executors.newCachedThreadPool();
        // keepAliveTime 60초(기본값) -> 3초로 조정
        ExecutorService es =
            new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                                   3, TimeUnit.SECONDS, new SynchronousQueue<>());

        log("pool 생성");
        printState(es);
        for (int i = 1; i <= 4; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(es);

        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(es); // pool은 모두 사라짐

        es.close();

        log("== shutdown 완료 ==");
    }
    /**
     * [     main] pool 생성
     * [     main] [pool=0, active=0, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-1] task1 시작
     * [     main] task1 -> [pool=1, active=1, queuedTasks=0, completedTasks=0]
     * [     main] task2 -> [pool=2, active=2, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-2] task2 시작
     * [     main] task3 -> [pool=3, active=3, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-3] task3 시작
     * [     main] task4 -> [pool=4, active=4, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-4] task4 시작
     * [pool-1-thread-1] task1 완료
     * [pool-1-thread-4] task4 완료
     * [pool-1-thread-2] task2 완료
     * [pool-1-thread-3] task3 완료
     * [     main] == 작업 수행 완료 ==
     * [     main] [pool=4, active=0, queuedTasks=0, completedTasks=4]
     * [     main] == maximumPoolSize 대기 시간 초과 ==
     * [     main] [pool=0, active=0, queuedTasks=0, completedTasks=4]
     * [     main] == shutdown 완료 ==
     */
}
