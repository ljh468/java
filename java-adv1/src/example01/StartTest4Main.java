package example01;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {

        Thread threadA = new Thread(new CounterThreadByParam("A", 1000), "Thread-A");
        Thread threadB = new Thread(new CounterThreadByParam("B", 500), "Thread-B");

        threadA.start();
        threadB.start();
    }


    static class CounterThreadByParam implements Runnable {

        private final String name;
        private final int sleepSeconds;

        public CounterThreadByParam(String name, int sleepSeconds) {
            this.name = name;
            this.sleepSeconds = sleepSeconds;
        }

        @Override
        public void run() {

            while (true) {

                log(name);

                try {
                    Thread.sleep(sleepSeconds);
                } catch (InterruptedException ignore) {
                }

            }

        }
    }
}
