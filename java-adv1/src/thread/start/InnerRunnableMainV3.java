package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV3 {

    // 익명 클래스 변수 제거
    public static void main(String[] args) {
        log("main() start");


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });

        thread.start();

        log("main() end");
    }
}
