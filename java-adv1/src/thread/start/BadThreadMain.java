package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();

        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run(); // 잘못된 run() 호출 -> main이 실행함
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

        // ########### 순서대로 실행하게 됨 ###########
        // main: main() start
        // main: start() 호출 전
        // main: run()
        // main: start() 호출 후
        // main: main() end
        // #######################################
    }
}
