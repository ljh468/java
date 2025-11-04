package example01;

import static util.MyLogger.log;

public class StartTest3Main {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                try {
                    log("value: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException ignore) {}
            }

        }, "counter");
        thread.start();
    }

}
