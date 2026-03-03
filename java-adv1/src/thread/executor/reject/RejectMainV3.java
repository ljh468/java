package thread.executor.reject;

import thread.executor.RunnableTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectMainV3 {

    public static void main(String[] args) {
        ThreadPoolExecutor executor =
            new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
                                   new SynchronousQueue<>(),
                                   new ThreadPoolExecutor.CallerRunsPolicy());

        // 첫 번째 요청
        executor.submit(new RunnableTask("task1"));

        // CallerRunsPolicy는 호출자(main)가 실행함
        executor.submit(new RunnableTask("task2"));

        executor.close();
    }
}
