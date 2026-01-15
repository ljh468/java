package thread.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static thread.executor.ExcutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ExecutorBasicMain {

    public static void main(String[] args) {

        ThreadPoolExecutor es = new ThreadPoolExecutor(2,
                                                       2,
                                                       0,
                                                       TimeUnit.MILLISECONDS,
                                                       new LinkedBlockingQueue<>());

        log("== 초기 상태 ==");
        printState(es);
        // 미리 만들지는 않음 - [pool=0, active=0, queuedTasks=0, completedTasks=0]
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("taskD"));

        log("== 작업 수행 중 ==");
        printState(es);
        // [pool=2, active=2, queuedTasks=2, completedTasks=0]
        sleep(3000);

        log("== 작업 수행 완료 ==");
        printState(es);
        // [pool=2, active=0, queuedTasks=0, completedTasks=4]
        es.close();

        log("== shutdown 완료 ==");
        printState(es);
        // [pool=0, active=0, queuedTasks=0, completedTasks=4]
    }
}
