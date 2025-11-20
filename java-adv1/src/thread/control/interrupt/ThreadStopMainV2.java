package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV2 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);

        log("작업 중단 지시 -> thread.interrupt()");
        // interrupt 메서드 호출 -> Thread가 깨어나서 InterruptedException 발생
        thread.interrupt();
        log("work 스레드 isInterrupted 1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {

                while (true) {
                    log("작업 중");
                    Thread.sleep(3000);
                }

            } catch (InterruptedException e) {
                log("work 스레드 isInterrupted 2 = " + Thread.currentThread().isInterrupted());
                log("interrupt message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState());
            }

            log("자원 정리");
            log("작업 종료");
        }
    }
}
