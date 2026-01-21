package thread.executor.future;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class FutureCancelMain {

    // private static boolean mayInterruptIfRunning = true;
    private static boolean mayInterruptIfRunning = false; // 우아한 종료

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<String> future = es.submit(new MyTask());

        // future 상태 확인 1
        log("Future.state: " + future.state());

        // 일정 시간 후 취소 시도 (10초 작업중 3초뒤 취소) = cancel() 호출
        sleep(3000);
        log("future.cancel(" + mayInterruptIfRunning + ") 호출");
        boolean cancelResult = future.cancel(mayInterruptIfRunning);

        // future 상태 확인 2
        log("Future.state: " + future.state());

        // cancel 결과 확인
        log("cancel(" + mayInterruptIfRunning + ") result: " + cancelResult);

        // 결과 확인
        try {
            log("Future result: " + future.get()); // cancel -> get (CancellationException 발생)
        } catch (CancellationException e) { // 런타임 예외
            log("Future는 이미 취소 되어 future.get()을 실행할 수 없습니다.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Executor 종료
        es.close();
    }

    static class MyTask implements Callable<String> {

        @Override
        public String call() {

            try {
                for (int i = 1; i <= 10; i++) {
                    log("작업 중: " + i);
                    Thread.sleep(1000); // 1초 동안 sleep
                }
            } catch (InterruptedException e) {
                log("인터럽트 발생");
                return "Interrupted";
            }

            return "Completed";
        }
    }

}
