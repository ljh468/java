package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static util.MyLogger.log;

public class ExcutorUtils {

    public static void printState(ExecutorService executorService) {

        if (executorService instanceof ThreadPoolExecutor poolExecutor) {

            // 스레드 풀에서 관리되는 스레드의 수
            int pool = poolExecutor.getPoolSize();
            // 작업을 수행하는 스레드의 수
            int active = poolExecutor.getActiveCount();
            // 큐에 대기중인 작업의 수
            int queuedTasks = poolExecutor.getQueue().size();
            // 완료된 작업의 수
            long completedTask = poolExecutor.getCompletedTaskCount();

            log("[pool=" + pool + ", active=" + active + ", queuedTasks=" +
                queuedTasks + ", completedTasks=" + completedTask + "]");
        } else {
            // ThreadPoolExecutor 구현체가 아니면 그냥 출력
            log(executorService);
        }
    }
}
