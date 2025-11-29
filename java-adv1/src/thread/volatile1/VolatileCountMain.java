package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {

    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");

        thread.start();

        sleep(1000);

        // 1초 뒤에 flag 변경
        task.runFlag = false;
        log("runFlag = " + task.runFlag + ", count = " + task.count + " in main()");

        /**
         * 출력:
         * [     main] runFlag = false, count = 1414715376 in main() <p>
         * [     work] runFlag = true, count = 1500000000 in while() <p>
         * [     work] runFlag = false, count = 1500000000 종료 <p>
         * <p>
         * main 쓰레드의 flag를 변경하는 시점과 work 쓰레드가 변경된 flag를 인식하는 시점이 다름 (캐시 메모리를 읽기 때문)
         */

    }

    static class MyTask implements Runnable {

        // volatile를 사용하지 않고 쓰레드는 캐시 메모리를 읽음
        boolean runFlag = true;
        long count = 0;

        @Override
        public void run() {

            while (runFlag) {
                count++;

                // 1억번 마다 출력
                if (count % 100_000_000 == 0) {

                    log("runFlag = " + runFlag + ", count = " + count + " in while()");
                }
            }

            log("runFlag = " + runFlag + ", count = " + count + " 종료");
        }
    }
}
