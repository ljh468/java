package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain2 {

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
         * [     work] runFlag = true, count = 500000000 in while() <p>
         * [     main] runFlag = false, count = 513652135 in main() <p>
         * [     work] runFlag = false, count = 513652135 종료 <p>
         * <p>
         * main 쓰레드의 flag를 변경하는 시점과 work 쓰레드가 변경된 flag를 인식하는 시점이 같음 (직접 메모리를 읽기 때문) <p>
         * 그러나, count를 읽는 숫자를 보면 성능의 차이가 나는 것을 확인할 수 있음 (2~5배까지)
         */

    }

    static class MyTask implements Runnable {

        // volatile를 사용하여 직접 메모리를 읽도록 함
        volatile boolean runFlag = true;
        volatile long count = 0;

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
