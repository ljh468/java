package thread.executor.poolsize;

import thread.executor.RunnableTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExcutorUtils.printState;
import static util.MyLogger.log;

public class PoolSizeMainV4 {

    // NOTE: 사용자정의 풀 전략
    // static final int TASK_SIZE = 1100; // 1. 일반

    // static final int TASK_SIZE = 1200; // 2. 긴급

    static final int TASK_SIZE = 1201; // 3. 거절

    public static void main(String[] args) throws InterruptedException {

        ExecutorService es =
            new ThreadPoolExecutor(100, 200, 60,
                                   TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        printState(es);

        // 시작
        long startMs = System.currentTimeMillis();
        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "task" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es, taskName);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        es.close();

        // 종료시간
        long endMs = System.currentTimeMillis();
        log("time: " + (endMs - startMs));
    }

    /**
     * ##### 일반적인 상황 (쓰레드 1100개) #####
     * [     main] [pool=0, active=0, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-1] task1 시작
     * [     main] task1 -> [pool=1, active=1, queuedTasks=0, completedTasks=0]
     * [     main] task2 -> [pool=2, active=2, queuedTasks=0, completedTasks=0]
     * ...
     * [     main] task1099 -> [pool=100, active=100, queuedTasks=999, completedTasks=0]
     * [     main] task1100 -> [pool=100, active=100, queuedTasks=1000, completedTasks=0]
     * [pool-1-thread-1] task1 완료
     * [pool-1-thread-1] task101 시작
     * ...
     * [pool-1-thread-85] task1097 완료
     * [pool-1-thread-84] task1098 완료
     * [pool-1-thread-89] task1099 완료
     * [pool-1-thread-64] task1100 완료
     * [     main] time: 11076
     * ##################################################
     *
     * ##################################################
     * ##### 긴급한 상황 (쓰레드 1200개), maxpool을 사용함 #####
     * [     main] [pool=0, active=0, queuedTasks=0, completedTasks=0]
     * [pool-1-thread-1] task1 시작
     * [     main] task1 -> [pool=1, active=1, queuedTasks=0, completedTasks=0]
     * [     main] task2 -> [pool=2, active=2, queuedTasks=0, completedTasks=0]
     * ...
     * [     main] task1100 -> [pool=100, active=100, queuedTasks=1000, completedTasks=0]
     * [     main] task1101 -> [pool=101, active=101, queuedTasks=1000, completedTasks=0]
     * ...
     * [     main] task1199 -> [pool=199, active=199, queuedTasks=1000, completedTasks=0]
     * [pool-1-thread-199] task1199 시작
     * [pool-1-thread-200] task1200 시작
     * [     main] task1200 -> [pool=200, active=200, queuedTasks=1000, completedTasks=0]
     * ...
     * [pool-1-thread-199] task1071 완료
     * [pool-1-thread-111] task1098 완료
     * [     main] time: 6082
     * ##################################################
     *
     * ##################################################
     * ##### 거절 상황 (쓰레드 1201개), RejectedExecutionException 예외 발생 #####
     * [     main] task1200 -> [pool=200, active=200, queuedTasks=1000, completedTasks=0]
     * [pool-1-thread-200] task1200 시작
     * [     main] task1201 -> java.util.concurrent.RejectedExecutionException:
     * Task thread.executor.RunnableTask@6a6824be rejected from
     * java.util.concurrent.ThreadPoolExecutor@2f4d3709
     * [Running, pool size = 200, active threads = 200, queued tasks = 1000, completed tasks = 0]
     * ##################################################
     */
}
