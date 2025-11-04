package thread.start;

public class DeamonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setDaemon(true);
        deamonThread.start();

        // 데몬 쓰레드를 기다리지 않고, 종료됨
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DeamonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");
            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
